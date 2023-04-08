package videoexamples.module14.inheritance.overloadvsride;

public class OverLoadRideExample {
	
	public static void main (String args[]) {
		Derived example = new Derived(4, "Java");
		
		System.out.println("Initial print()");
		example.print();
		
		System.out.println();
		System.out.println("Calling change(int)");
		example.change(11);
		example.print();
		
		System.out.println();
		System.out.println("Calling change(String)");
		example.change("Chandler");
		example.print();
		
		System.out.println();
		System.out.println("Calling change(int, String)");
		example.change(48,"Chandler");
		example.print();
	}	

}
