package transformer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import exception.DependencyUnreachableException;

/*
 * (c) Igor Buzhinsky
 */

public class CompositeFB extends FB {
	private final Map<String, FBInstance> nestedInstances = new LinkedHashMap<>();
	
	public List<FBInstance> nestedInstances() {
		return Collections.unmodifiableList(new ArrayList<>(nestedInstances.values()));
	}
	
	public FBInstance getNested(String name) {
		return nestedInstances.get(name);
	}
	
	public CompositeFB(String name, String packageName, FBInterface fbInterface) {
		super(name, packageName, fbInterface);
	}
	
	public void addNested(FBInstance instance) {
		nestedInstances.put(instance.name, instance);
	}

	@Override
	public List<FB> allDependencies(Map<String, FB> allBlocks) throws DependencyUnreachableException {
		List<FB> deps = new ArrayList<>();
		deps.add(this);
		for (FBInstance inst : nestedInstances.values()) {
			FB child = allBlocks.get(inst.type);
			if (child == null) {
				throw new DependencyUnreachableException();
			}
			deps.addAll(child.allDependencies(allBlocks));
		}
		return deps;
	}
}