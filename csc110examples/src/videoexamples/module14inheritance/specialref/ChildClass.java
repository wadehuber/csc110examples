package videoexamples.module14inheritance.specialref;

public class ChildClass extends ParentClass {
	
	private String myName;    // Shadow data member - USE CAUTION

	public ChildClass(int num) {
		super(num*10);
		myName = "ChildClass";
		this.num=num;
	}
	
	public void setValues(String pName, String cName, int num) {
		super.myName = pName;
		this.myName = cName;        // Don't need "this" reference here
		num = num * 2;              // This is num the parameter
		this.num = num;             // Must use "this"reference here
	}

	@Override
	public String toString() {
		return super.toString() + " --> ChildClass [myName=" + myName + ", num=" + num + "]";
	}
}
