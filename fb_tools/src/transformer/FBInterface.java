package transformer;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/*
 * (c) Igor Buzhinsky
 */

public class FBInterface {
	private final Map<String, Event> inputEvents = new LinkedHashMap<>();
	private final Map<String, Event> outputEvents = new LinkedHashMap<>();
	private final Map<String, Variable> inputVariables = new LinkedHashMap<>();
	private final Map<String, Variable> outputVariables = new LinkedHashMap<>();

	public void addInputEvent(Event inputEvent) {
		inputEvents.put(inputEvent.name, inputEvent);
	}
	
	public void addOutputEvent(Event outputEvent) {
		outputEvents.put(outputEvent.name, outputEvent);
	}
	
	public void addInputVariable(Variable inputVariable) {
		inputVariables.put(inputVariable.name, inputVariable);
	}
	
	public void addOutputVariable(Variable outputVariable) {
		outputVariables.put(outputVariable.name, outputVariable);
	}
	
	public Collection<Event> inputEvents() {
		return Collections.unmodifiableCollection(inputEvents.values());
	}
	
	public Collection<Event> outputEvents() {
		return Collections.unmodifiableCollection(outputEvents.values());
	}
	
	public Collection<Variable> inputVariables() {
		return Collections.unmodifiableCollection(inputVariables.values());
	}
	
	public Collection<Variable> outputVariables() {
		return Collections.unmodifiableCollection(outputVariables.values());
	}
	
	public Variable inputVariable(String name) {
		return inputVariables.get(name);
	}
	
	@Override
	public String toString() {
		Function<Map<String, ?>, String> assemble = c ->
			String.join("\n", Util.map(c.values(), Object::toString)
		);
		return "// InputEvents\n" + assemble.apply(inputEvents)
				+ "\n// OutputEvents\n" + assemble.apply(outputEvents)
				+ "\n// InputVars\n" + assemble.apply(inputVariables)
				+ "\n// OutputVars\n" + assemble.apply(outputVariables);
	}
}
