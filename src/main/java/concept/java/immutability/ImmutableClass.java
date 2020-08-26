package concept.java.immutability;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author sidkumar3
 * 
 *         1. Make the class final so that it cannot be subclassed else the
 *         sublclass may provide setter methods and ummasking private fields
 *         thus making it mutable 2. Make all the mutable field final so that
 *         can be initiliased only once 3. Initialize all fields in constructor
 *         while perforing deep copy 4. return a cloned object in getter method
 *         instead of returning the original
 * 
 *
 */
public final class ImmutableClass {

	private final Map<Integer, Integer> map;
	private String stringField;
	private final int primitive;

	public ImmutableClass(Map<Integer, Integer> map, String s, int intPrimitive) {

		this.map = new HashMap<Integer, Integer>();
		map.entrySet().forEach(entry -> {
			this.map.put(entry.getKey(), entry.getValue());
		});

		this.stringField = s;
		primitive = intPrimitive;

	}

	public Map<Integer, Integer> getMap() {

		return (Map<Integer, Integer>) ((HashMap<Integer, Integer>) this.map).clone();
//		Map<Integer, Integer> clonedMap = new HashMap<Integer, Integer>();
//		map.entrySet().forEach(entry -> {
//			clonedMap.put(entry.getKey(), entry.getValue());
//		});
//		return clonedMap;
	}

	public String getStringField() {
		return stringField;
	}

	public int getPrimitive() {
		return primitive;
	}

	@Override
	public String toString() {
		return "ImmutableClass [map=" + map + ", stringField=" + stringField + ", primitive=" + primitive + "]";
	}

}
