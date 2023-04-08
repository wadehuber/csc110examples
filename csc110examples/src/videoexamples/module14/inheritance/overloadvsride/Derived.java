package videoexamples.module14.inheritance.overloadvsride;

public class Derived extends Base {
	private String s;

	public Derived(int a) {
		super(a);
	}

	public Derived(int a, String s) {
		super(a);
		this.s = s;
	}

	// Inherits change(int x) method from parent class
	// change(String y) overloads change method
	public void change(String y) {
		System.out.println("DERIVED: change with String parameter");
		s = y;
	}

	// change(int x, String y) also overloads change method
	public void change(int x, String y) {
		System.out.println("DERIVED: change with int & String parameters");
		a = x;
		s = y;
	}

	// print() overrides print() method from parent class
	public void print() {
		System.out.println("DERIVED: a=" + a + " and s=" + s);
	}

}
