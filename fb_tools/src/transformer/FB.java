package transformer;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import exception.DependencyUnreachableException;

/*
 * (c) Igor Buzhinsky
 */

public abstract class FB {
	public final String name;
	public final String packageName;
	public final FBInterface fbInterface;
	private Optional<String> xml = Optional.empty();
	
	public FB(String name, String packageName, FBInterface fbInterface) {
		this.name = name;
		this.packageName = packageName;
		this.fbInterface = fbInterface;
	}
	
	public abstract List<FB> allDependencies(Map<String, FB> allBlocks) throws DependencyUnreachableException;
	
	public void setXml(String xml) {
		this.xml = Optional.of(xml);
	}
	
	public String xml() {
		return xml.get();
	}
}