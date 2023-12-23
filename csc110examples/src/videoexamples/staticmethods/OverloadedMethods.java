package videoexamples.staticmethods;

public class OverloadedMethods {
	
	public static void doSomething(String str) {
		System.out.println("--- " + str + " ---");
	}

	public static void doSomething(String str, int num) {
		for (int ii=0;ii<num;ii++) {
			System.out.println(str);
		}
	}
	
	public static void doSomething(String str, double measured) {
		if (measured < Math.PI) {
			System.out.println(str);
		}
		else {
			doSomething(str, 3);
		}
	}
	
	public static void doSomething(String str1, String str2) {
		System.out.println(str1);
		System.out.println(str2);
	}

	public static void main(String[] args) {

		System.out.println("doSomething(String)");
		doSomething("Overloaded Methods");
		System.out.println();
		
		System.out.println("doSomething(String, int)");
		doSomething("I am a programmer", 4);
		System.out.println();

		System.out.println("doSomething(String, double)");
		doSomething("CSC110 Test 1", 3.0);
		doSomething("CSC110 Test 2", 4.0);
		System.out.println();

		System.out.println("doSomething(String, String)");
		doSomething("Hello", "World");

	}

}
