package transformer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import exception.DependencyUnreachableException;
import fb.xml.XMLException;

/*
 * (c) Igor Buzhinsky
 */

public class FBTransformer {
	/*
	 * Transition markers for transition coverage.
	 */
	public static final boolean INSERT_TRANSITION_MARKERS = true;
	
	public static List<String> printNestedFB(FBSource thisSource, FBSource dep, List<String> lines) {
		dep = dep.applyForJavaSource(line -> line.replaceAll("^(import|package).*$", ""));
		dep = dep.applyForJavaSource(line -> line.replaceAll("^public class ", "private class "));
		
		dep = dep.applyForFullJavaSource(line -> removeMethod(line, "EventServer eiNamed\\("));
		dep = dep.applyForFullJavaSource(line -> removeMethod(line, "EventOutput eoNamed\\("));
		dep = dep.applyForFullJavaSource(line -> removeMethod(line, "ANY ivNamed\\("));
		
		dep = dep.applyForFullJavaSource(line -> removeMethod(line, "void start\\("));
		dep = dep.applyForFullJavaSource(line -> removeMethod(line, "void stop\\("));
		dep = dep.applyForFullJavaSource(line -> removeMethod(line, "void initialize\\("));
		
		if (dep.classname.equals(thisSource.classname)) {
			// can remove more methods
			dep = dep.applyForFullJavaSource(line -> removeMethod(line, "void connectIV\\("));
			dep = dep.applyForFullJavaSource(line -> removeMethod(line, "void connect_"));
			dep = dep.applyForFullJavaSource(line -> removeMethod(line, "ANY ovNamed\\("));
		}
		
		List<String> transitionMethods = new ArrayList<>();
		if (INSERT_TRANSITION_MARKERS) {
			String regexpNormal = "^( *(else )?if \\(\\(eccState == index_.* )(state_\\w*\\(\\);)$";
			String regexpSpontaneous = "^ *(state_\\w*\\(\\);)$";
			//String regexp = "^.*if.*$";
			int[] count = new int[] { 0 };
			String methodPrefix = "transition_" + dep.classname + "_";
			dep = dep.applyForJavaSource(line -> {
				if (line.matches(regexpNormal)) {
					line = line.replaceAll(regexpNormal, "$1{\n $3\n " + methodPrefix
							+ count[0] + "(); \n}");
					count[0]++;
				} else if (line.matches(regexpSpontaneous)) {
					line = line.replaceAll(regexpSpontaneous, "$1\n" + methodPrefix
							+ count[0] + "();");
					count[0]++;
				}
				return line;
			});
			for (int i = 0; i < count[0]; i++) {
				transitionMethods.add("private void " + methodPrefix + i + "() {\n}");
			}
		}
		
		lines.add(dep.javaSource);
		return transitionMethods;
	}
	
	private static class DependencyGraph {
		private final List<String> topSort = new ArrayList<>();
		private final Set<String> visited = new TreeSet<>();
		private final Map<String, Set<FB>> dependencies;
		
		DependencyGraph(Map<String, Set<FB>> dependencies) {
			this.dependencies = dependencies;
		}
		
		private void dfs(String node) {
			if (visited.contains(node)) {
				return;
			}
			visited.add(node);
			for (FB child : dependencies.get(node)) {
				dfs(child.name);
			}
			topSort.add(node);
		}
		
		List<String> topologicalSorting() {
			for (String node : dependencies.keySet()) {
				dfs(node);
			}
			return topSort;
		}
	}
	
	public static void main(String[] args) {
		// 1. Load all FBs
		final Map<String, FB> allBlocks = Util.loadAllBlocks();
		
		// 2. Sort dependencies
		final Map<String, Set<FB>> dependencies = new TreeMap<>();
		for (Map.Entry<String, FB> entry : allBlocks.entrySet()) {
			String name = entry.getKey();
			FB fb = entry.getValue();
			try {
				List<FB> depList = fb.allDependencies(allBlocks);
				dependencies.put(name, new LinkedHashSet<>(depList));
			} catch (DependencyUnreachableException e) {
				Util.logWarning("unreachable dependency for " + name);
			}
		}
		allBlocks.keySet().retainAll(dependencies.keySet());
		final DependencyGraph dg = new DependencyGraph(dependencies);
		final List<String> topSort = dg.topologicalSorting();
		
		// 3. Collect FBSource's
		Map<String, FBSource> sources = new LinkedHashMap<>();
		for (String name : topSort) {
			FB fb = allBlocks.get(name);
			Set<FB> depSet = dependencies.get(name);
			if (depSet.stream().anyMatch(b -> b instanceof OtherFB)) {
				continue;
			}
			try {
				String xmlSource = allBlocks.get(name).xml();
				xmlSource = Util.preprocessXmlSourceForBasicFb(xmlSource);
				xmlSource = Util.preprocessXmlSourceForCompositeFb(xmlSource);
				Optional<FBSource> source = FBSource.load(fb.name, fb.packageName, xmlSource);
				if (source.isPresent()) {
					sources.put(name, source.get());
				}
			} catch (IOException | XMLException e) {
				e.printStackTrace();
			}
		}
		
		for (String name : sources.keySet()) {
			FBSource source = sources.get(name);
			FB fb = allBlocks.get(name);
			Set<FB> depSet = dependencies.get(name);
			
			Util.logInfo("[GENERATED SOURCE] " + name);
			Map<String, Event> events = new LinkedHashMap<>();
			fb.fbInterface.inputEvents().forEach(e -> events.put(e.name, e));
			Map<String, Variable> inputVars = new LinkedHashMap<>();
			fb.fbInterface.inputVariables().forEach(v -> inputVars.put(v.name, v));
			
			String suffix = fb instanceof BasicFB ? "__Basic" : "__Composite";
			
			String filename = "../fb/src/fb/rt/" + source.subpackage +
				"/" + name + suffix + ".java";
			
			List<String> lines = new ArrayList<>();
			lines.add("package fb.rt." + source.subpackage + ";");
			lines.add("");
			lines.add("import fb.rt.*;");
			lines.add("import fb.rt.net.*;");
			lines.add("import fb.datatype.*;");
			lines.add("");
			lines.add("public class " + name + suffix + " {");
			lines.add("    private final " + name + " instance = new " + name + "();");
			lines.add("");
			
			for (Event e: events.values()) {
				lines.add(Util.shiftCode(eventMethodCode(events, inputVars, e.name)
					+ "\n    instance." + e.name + ".serviceEvent(instance); \n}"));
				lines.add("");
			}

			for (FB dep : depSet) {
				List<String> transitionMethods = printNestedFB(source, sources.get(dep.name), lines);
				transitionMethods.forEach(lines::add);
			}
			lines.add("}");
			
			try (PrintWriter pw = new PrintWriter(new File(filename))) {
				pw.print(String.join("\n", lines));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				Util.beautifySource(filename);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static String eventMethodCode(Map<String, Event> events,
			Map<String, Variable> inputVars, String eventName) {
		Event e = events.get(eventName);
		List<Variable> vars = Util.map(new ArrayList<>(e.with()),
				varName -> inputVars.get(varName));
		return "public void event_" + eventName + "("
				+ String.join(", ", Util.map(vars, Variable::transformHeader))
				+ ") {\n"
				+ Util.shiftCode(String.join("\n",
					Util.map(vars, Variable::creatorLine)));
	}
	
	private static String removeMethod(String source, String signature) {
		boolean removingMethod = false;
		List<String> lines = new ArrayList<>();
		int startBalance = -1;
		int balance = 0;
		for (String line : source.split("\n")) {
			balance += Util.count(line, "{");
			balance -= Util.count(line, "}");
			if (removingMethod) {
				if (balance == startBalance) {
					removingMethod = false;
				}
			} else if (line.matches("^.*(public|protected) " + signature + ".*$")) {
				startBalance = balance - Util.count(line, "{");
				removingMethod = true;
			} else {
				lines.add(line);
			}
		}
		return String.join("\n", lines);
	}
}
