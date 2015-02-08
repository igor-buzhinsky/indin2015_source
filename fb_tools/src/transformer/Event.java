package transformer;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * (c) Igor Buzhinsky
 */

public class Event {
	public final String name;
	private final Set<String> with = new LinkedHashSet<>();
	
	public Event(String name) {
		assert !name.isEmpty();
		this.name = name;
	}
	
	public Set<String> with() {
		return Collections.unmodifiableSet(with);
	}
	
	public void addWith(String with) {
		this.with.add(with);
	}
}