package videoexamples.module14.inheritance.specialref;

public class ParentClass {
	
	protected String myName;
	protected int num;

	public ParentClass(int num) {
		this.num = num;
		myName = "ParentClass";
	}

	@Override
	public String toString() {
		return "ParentClass [myName=" + myName + ", num=" + num + "]";
	}

}
