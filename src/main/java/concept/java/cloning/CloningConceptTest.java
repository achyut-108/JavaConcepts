package concept.java.cloning;

import java.util.HashMap;
import java.util.Map;

import concept.java.immutability.ImmutableClass;

public class CloningConceptTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		ImmutableClass immutableClass1 = new ImmutableClass(map, "Hare Krishna", 5);
		ClassToBeCloned classToBeCloned = new ClassToBeCloned(1, new Integer(5), immutableClass1,
				new NormalClass(6, "VrishbhanuSuteDevi"));

		System.out.println("before cloning : " + classToBeCloned.toString());
		ClassToBeCloned clonedClass = (ClassToBeCloned) classToBeCloned.clone();

		System.out.println("after cloning : " + clonedClass.toString());

	}

}
