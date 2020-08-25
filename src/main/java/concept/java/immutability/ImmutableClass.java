package concept.java.immutability;

import java.util.HashMap;
import java.util.Map;

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

		Map<Integer, Integer> clonedMap = new HashMap<Integer, Integer>();
		map.entrySet().forEach(entry -> {
			clonedMap.put(entry.getKey(), entry.getValue());
		});
		return clonedMap;
	}

	public String getStringField() {
		return stringField;
	}

	public int getPrimitive() {
		return primitive;
	}

}
