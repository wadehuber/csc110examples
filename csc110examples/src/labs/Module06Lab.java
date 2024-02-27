package labs;

public class Module06Lab {
	
	public static void welcome(String name) {

	}
	
	public static void multiPrint(String str, int count) {

	}
	
	public static double awardBonus(double pay, int bonus) {
		return 0.0;
	}
	
	public static Boolean isMultiple(int x, int y) {
		return false;
	}
	
	public static int lowercaseCount(String str) {
		return 0;
	}
	
	// This method tests your isMultiple method
	public static void testIsMultiple(int x, int y) {
		if (isMultiple(x, y)) {
			System.out.println(x + " is a multiple of " + y);
		}
		else {
			System.out.println(x + " is a multiple of " + y);
		}
	}

	public static void main(String[] args) {
		String name = "Leslie Lamport";
		String title = "Time, Clocks and the Ordering of Events in a Distributed System";
		welcome(name);
		multiPrint("This is a test.", 3);
		System.out.printf("Pay with bonus: %.2f \n", awardBonus(75000.0, 15));
		testIsMultiple(24, 8);
		testIsMultiple(25, 7);
		System.out.println(name + " has " + lowercaseCount(name) + " lowercase characters ");
		System.out.println(title + "\n    has " + lowercaseCount(title) + " lowercase characters ");
	}

}
