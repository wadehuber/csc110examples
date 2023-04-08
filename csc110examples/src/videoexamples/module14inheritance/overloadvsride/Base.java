package videoexamples.module14inheritance.overloadvsride;

public class Base {
	protected int a;

	public Base(int a) {
		super();
		this.a = a;
	}
	
	public void change(int x) {
		System.out.println("BASE: change with int parameter");
		a = x;
	}

	public void print() {
		System.out.println("BASE: a=" + a);
	}
}
