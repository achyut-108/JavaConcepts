package concept.java.immutability;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClassTest {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		ImmutableClass immutableClass1 = new ImmutableClass(map, "Hare Krishna", 5);

		Map<Integer, Integer> map1 = immutableClass1.getMap();

		map.put(2, 2);

		Map<Integer, Integer> map2 = immutableClass1.getMap();

//		ImmutableClass immutableClass2 = new ImmutableClass(map, "Hare Krishna", 5);

		System.out.println(map1 == map2);

		map1.entrySet().forEach(entry -> {
			System.out.println("map1 : " + entry.getKey() + " : " + entry.getValue());
		});

		map2.entrySet().forEach(entry -> {
			System.out.println("map2 : " + entry.getKey() + " : " + entry.getValue());
		});
	}
}