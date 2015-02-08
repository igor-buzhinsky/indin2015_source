package transformer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

/*
 * (c) Igor Buzhinsky
 */

public class Util {
	private Util() {
	}
	
	private static final Logger LOGGER = Logger.getLogger("Logger");
	
	private static class MyFormatter extends Formatter {
		@Override
		public String format(LogRecord record) {
			return record.getMillis()
					+ " " + record.getMessage() + "\n";
		}
	}
	
	public static void addConsoleLogger() {
		LOGGER.addHandler(new StreamHandler(System.out, new MyFormatter()));
	}
	
	static {
		LOGGER.setUseParentHandlers(false);
		try {
			FileOutputStream thisOs = new FileOutputStream("this-log.log", false);
			FileOutputStream allOs = new FileOutputStream("all-logs.log", true);
			allOs.write(("*** " + System.currentTimeMillis() + "\n").getBytes());
			Formatter f = new MyFormatter();
			LOGGER.addHandler(new StreamHandler(thisOs, f));
			LOGGER.addHandler(new StreamHandler(allOs, f));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void logWarning(Object msg) {
		LOGGER.warning(msg.toString());
		Arrays.stream(LOGGER.getHandlers()).forEach(h -> h.flush());
	}
	
	public static void logInfo(Object msg) {
		LOGGER.info(msg.toString());
		Arrays.stream(LOGGER.getHandlers()).forEach(h -> h.flush());
	}

	public static final String PATH_START = "../fb/xml";
	
	public static final List<String> SUBPACKAGES = Collections.unmodifiableList(Arrays.asList(
		"waterprocess", "pnp"
	));
	
	public static List<Integer> range(int length) {
		Integer[] range = new Integer[length];
		for (int i = 0; i < length; i++) {
			range[i] = i;
		}
		return Arrays.asList(range);
	}

	public static <T, R> List<R> map(Collection<T> l,
			Function<? super T, ? extends R> f) {
		List<R> result = new ArrayList<R>(l.size());
		for (T elem : l) {
			result.add(f.apply(elem));
		}
		return result;
	}

	public static String applyByLine(String code, Function<String, String> f) {
		return String.join("\n", map(Arrays.asList(code.split("\n")), f));
	}

	public static String shiftCode(String code) {
		return applyByLine(code, line -> "    " + line);
	}

	public static int count(String str, String findStr) {
		int lastIndex = 0;
		int count = 0;
		while (lastIndex != -1) {
			lastIndex = str.indexOf(findStr, lastIndex);
			if (lastIndex != -1) {
				count++;
				lastIndex += findStr.length();
			}
		}
		return count;
	}
	
	public static void beautifySource(String filename) throws IOException {
		try {
			// beautify
			final Process p = Runtime.getRuntime().exec(new String[] {
					"jacobe", "--indent", "--assignspace", "--spaceassign",
					"--keywordspaceopenparen", "--methodblanklines",
					"--spaceopenbrace", "--infixopspace", "--spaceinfixop",
					"--castspace", "-overwrite", filename
			});
			p.waitFor();
			new File(filename + ".jacobe").delete();
		} catch (InterruptedException e) {
			assert false;
		}
	}
	
	public static String preprocessXmlSourceForBasicFb(String xmlSource) {
		xmlSource = xmlSource.replaceAll("encoding=\"utf-8\"", "encoding=\"UTF-8\"");
		xmlSource = xmlSource.replaceAll("\\.dtd\">", ".dtd\" >");
		xmlSource = xmlSource.replaceAll("<Attribute.*/>", "");
		xmlSource = xmlSource.replaceAll("Date=\"([0-9]+)/([0-9]+)/([0-9]+)\"", "Date=\"$3-$2-$1\"");
		xmlSource = xmlSource.replaceAll("\\(\\*", "/*");
		xmlSource = xmlSource.replaceAll("\\*\\)", "*/");
		xmlSource = xmlSource.replaceAll("Namespace=\"Main\"", "");
		return xmlSource;
	}
	
	public static String preprocessXmlSourceForCompositeFb(String xmlSource) {
		xmlSource = xmlSource.replaceAll("Namespace=\"IEC61499.Standard\"", "");
		xmlSource = xmlSource.replaceAll("<Attribute Name=.*/>", "");
		xmlSource = xmlSource.replaceAll("<FB ID=\"[0-9]+\" ", "<FB ");
		xmlSource = xmlSource.replaceAll("<Input Name=\".*\">", "");
		xmlSource = xmlSource.replaceAll("</Input>", "");
		xmlSource = xmlSource.replaceAll("<IsType>.*</IsType>", "");
		xmlSource = xmlSource.replaceAll("<AvoidsNodes>.*</AvoidsNodes>", "");
		xmlSource = Pattern.compile(
				"<(Position|Points)>[\r\n ]+<X>[0-9\\.]+</X>[\r\n ]+<Y>[0-9\\.]+</Y>[\r\n ]+</\\1>",
				Pattern.MULTILINE).matcher(xmlSource).replaceAll("");
		xmlSource = xmlSource.replaceAll("<Points>", "");
		xmlSource = xmlSource.replaceAll("</Points>", "");
		return xmlSource;
	}
	
	public static FB parse(File file, String packageName) throws ParserConfigurationException, SAXException, IOException {
		final SAXParser p = SAXParserFactory.newInstance().newSAXParser();
		final FbtHandler handler = new FbtHandler(packageName);
		try (BufferedReader input = new BufferedReader(new FileReader(file))) {
			String str = String.join("\n", input.lines().collect(Collectors.toList()));
			str = str.replace("http://www.holobloc.com/xml/LibraryElement.dtd",
					"../Holobloc_LibraryElement.dtd");
			final byte[] bytes = str.getBytes();
			p.parse(new ByteInputStream(bytes, bytes.length), handler);
			final FB result = handler.result();
			result.setXml(str);
			return handler.result();
		}
	}
	
	public static Map<String, FB> loadAllBlocks() {
		final Map<String, FB> allBlocks = new TreeMap<>();
		
		// 1. Load all FBs
		for (String subpackage : Util.SUBPACKAGES) {
			for (File f : new File(Util.PATH_START + "/" + subpackage).listFiles()) {
				if (f.getName().endsWith(".fbt") || f.getName().endsWith(".adp")) {
					try {
						FB fb = parse(f, subpackage);
						allBlocks.put(fb.name, fb);
					} catch (IOException | ParserConfigurationException | SAXException e) {
						throw new RuntimeException(e);
					}
				}
			}
		}
		return allBlocks;
	}
}
