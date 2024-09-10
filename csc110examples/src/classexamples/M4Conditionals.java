package classexamples;

public class M4Conditionals {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 33;
		
		String str1 = "Percy";
		String str2 = "Annabeth";
		String str3 = "Grover";
		
		// If num1 is less than num2 print "Hello"
		if (num1 < num2) {
			System.out.println("Hello!");
		}

		// If num1 + num2 is less than num3, print "Greetings"
		//   otherwise print "You are not welcome"
		if (num1 + num2 < num3) {
			System.out.println("Greetings");
			System.out.println("One more line");
		}
		else {
			System.out.println("You are not welcome");
		}
		
		//   If the square of num1 is less than num2 * num3
		//     display "You may continue"
		if (Math.pow(num1, 2) < num2 * num3) {
			System.out.println("You may continue");
		}
		
		// Brackets around 1 line code blocks are not required, but are recommended
		int x = 115;
		if (num3 > x) {
			System.out.println("num3 is greater than x");
			System.out.println("Here's another line if num3>x");
		}

		System.out.println("\nStrings:");
		System.out.println("str1 = Percy");
		System.out.println("str2 = Annabeth");
		System.out.println("str3 = Grover");
		
		// Don't use == to compare strings
		String p = "Percy";
		if (str1 == p) {
			System.out.println("if case is true");
		}
		else {
			System.out.println("if case is false (in else)");
		}

		// Use .equals() instead
		if (str1.equals(str2)) {
			System.out.println("if case is true");
		}
		else {
			System.out.println("if case is false (in else)");
		}
		
		if (str3.toLowerCase().equals("grover")) {
			System.out.println("if case is true");
		}
		else {
			System.out.println("if case is false (in else)");
		}
		
		// Use compareTo to compare the ordering of two strings
		if (str1.compareTo(str2) > 0) {
			System.out.println("if case is true");
		}
		else {
			System.out.println("if case is false (in else)");
		}
		
		
		// Compound boolean statements
		if ((num1 > num2) && (str1.compareTo(p) == 0)) {
			System.out.println("if case is true");
		}
		else {
			System.out.println("if case is false (in else)");
		}
		
		if ((num1 > num2) || (str1.compareTo(p) == 0)) {
			System.out.println("if case is true");
		}
		else {
			System.out.println("if case is false (in else)");
		}
		
		
	}

}
