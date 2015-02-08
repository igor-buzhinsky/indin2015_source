package transformer;

import java.io.IOException;
import java.util.Optional;
import java.util.function.Function;

import fb.xml.XMLException;

/*
 * (c) Igor Buzhinsky
 */

public class FBSource {
	public final String classname;
	public final String subpackage;
	public final String javaSource;
	public final String xmlSource;
	
	private FBSource(String classname, String subpackage, String javaSource, String xmlSource) {
		this.classname = classname;
		this.subpackage = subpackage;
		this.javaSource = javaSource;
		this.xmlSource = xmlSource;
	}
	
	public FBSource applyForJavaSource(Function<String, String> f) {
		return new FBSource(classname, subpackage, Util.applyByLine(javaSource, f), xmlSource);
	}
	
	public FBSource applyForFullJavaSource(Function<String, String> f) {
		return new FBSource(classname, subpackage, f.apply(javaSource), xmlSource);
	}
	
	public static Optional<FBSource> load(String className, String packageName, String xmlSource) throws IOException, XMLException {
		String javaSource = FBDKTransformer.transform(xmlSource);
		return javaSource.contains("extends fb.rt.Adapter")
			? Optional.empty()
			: Optional.of(new FBSource(className, packageName, javaSource, xmlSource));
	}
	
	@Override
	public String toString() {
		return "FBSource[" + classname + "]";
	}
}
