package transformer;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/*
 * (c) Igor Buzhinsky
 */

public class Variable {
	public final String name;
	public final Type type;
	public final int arraySize;
	
	public static String objectToJavaSourceString(Object o) {
		return o instanceof Float ? (o.toString() + "f")
				: o instanceof Short ? ("(short) " + o.toString())
				: o instanceof Long ? (o.toString() + "L")
				: o.toString();
	}
	
	public enum Type {
		BOOL(boolean.class),
		INT(short.class), UINT(int.class),
		REAL(float.class),
		TIME(long.class),
		WSTRING(String.class);

		public final String javaName;
		public final Class<?> javaClass;
		
		private Type(Class<?> javaClass) {
			this.javaName = javaClass.getSimpleName();
			this.javaClass = javaClass;
		}
		
		public Object parse(String value) {
			switch (this) {
			case BOOL:
				String lower = value.toLowerCase();
				if (lower.equals("1") || lower.equals("true")) {
					return true;
				} else if (lower.equals("0") || lower.equals("false")) {
					return false;
				} else {
					throw new RuntimeException("Bad default value.");
				}
			case INT:
				return Short.parseShort(value);
			case UINT:
				return Integer.parseInt(value);
			case REAL:
				return Float.parseFloat(value);
			case TIME:
				return Long.parseLong(value.replace("t#", "").replace("ms", ""));
			case WSTRING:
				return value;
			default:
				throw new NotImplementedException();
			}
		}
	}
	
	public boolean isArray() {
		return arraySize > 1;
	}
	
	public Variable(String name, String type, int arraySize) {
		this.name = name;
		this.type = Type.valueOf(type);
		this.arraySize = arraySize;
	}

	private String constructorExpression(int arrayIndex) {
		final String newName = isArray() ? name + "_" + arrayIndex : (name + "_");
		switch (type) {
		case UINT: return "Math.abs(" + newName + ")";
		default: return newName;
		}
	}

	// FBDK-compatible
	public String creatorLine() {
		return isArray()
			? String.join("\n", Util.map(Util.range(arraySize), i -> "((" + type +
				") instance." + name + ".value[" + i + "]).value = "
				+ constructorExpression(i) + ";"))
			: ("instance." + name + ".value = " + constructorExpression(0) + ";");
	}
	
	public String transformHeader() {
		final String newType = type.javaClass.getSimpleName();
		return isArray()
			? String.join(", ", Util.map(Util.range(arraySize), i -> newType + " " + name + "_" + i))
			: (newType + " " + name + "_");
	}
}