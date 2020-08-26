package concept.java.cloning;

import concept.java.immutability.ImmutableClass;

public class ClassToBeCloned implements Cloneable {

	private int intPrimitive;
	private Integer intObject;
	private ImmutableClass immutableObject;
	private NormalClass normalClass;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public ClassToBeCloned() {
	}

	public ClassToBeCloned(int intPrimitive, Integer intObject, ImmutableClass immutableObject,
			NormalClass normalClass) {
		this.intPrimitive = intPrimitive;
		this.intObject = intObject;
		this.immutableObject = immutableObject;
		this.normalClass = normalClass;
	}

	public int getIntPrimitive() {
		return intPrimitive;
	}

	public void setIntPrimitive(int intPrimitive) {
		this.intPrimitive = intPrimitive;
	}

	public Integer getIntObject() {
		return intObject;
	}

	public void setIntObject(Integer intObject) {
		this.intObject = intObject;
	}

	public ImmutableClass getImmutableObject() {
		return immutableObject;
	}

	public void setImmutableObject(ImmutableClass immutableObject) {
		this.immutableObject = immutableObject;
	}

	public NormalClass getNormalClass() {
		return normalClass;
	}

	public void setNormalClass(NormalClass normalClass) {
		this.normalClass = normalClass;
	}

	@Override
	public String toString() {
		return "ClassToBeCloned [intPrimitive=" + intPrimitive + ", intObject=" + intObject + ", immutableObject="
				+ immutableObject + ", normalClass=" + normalClass + "]";
	}
}
