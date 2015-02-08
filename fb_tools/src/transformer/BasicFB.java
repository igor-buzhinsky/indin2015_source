package transformer;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
 * (c) Igor Buzhinsky
 */

public class BasicFB extends FB {
	public BasicFB(String name, String packageName, FBInterface fbInterface) {
		super(name, packageName, fbInterface);
	}

	@Override
	public List<FB> allDependencies(Map<String, FB> allBlocks) {
		return Collections.singletonList(this);
	}
}