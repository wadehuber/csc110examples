package classexamples.module04conditionals;

public class Conditionals {

	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 33;
		
		String str1 = "Percy";
		String str2 = "Annabeth";
		String str3 = "Grover";
		
		System.out.println("Examples of conditionals in Java");

		System.out.println("Java if statements");
		
		// If num1 is less than num2 print "Hello"
		if (num1 < num2) {
			System.out.println("Hello!");
		}
		// If num1 is greater than num2 print "YOU FAIL"
		if (num1 > num2) {
			System.out.println("YOU FAIL!");
		}
		
		// Multiple conditions
		// If num3 > num2 AND if num3 is a multiple of 3
		if ((num3 > num2) && (num3 % 3 == 0)) {
			System.out.println("It is both");
		}
		System.out.println("Done with simple if statements");
		System.out.println();

		System.out.println("Java if-else statements");
		
		// If num1 + num2 is less than num3, print "Greetings"
		//   otherwise print "You are not welcome"
		if ((num1 + num2) < num3) {
			System.out.println("Greetings");
			System.out.println("   Thanks for coming!");
		}
		else {
			System.out.println("You are not welcome");
		}
		
		// If the square of num1 is greater than num2 * num3
		//    display "You many continue"
		//    otherwise, display "You shall not pass!"
		if (Math.pow(num1,  2) > (num2 * num3)) {
			System.out.println("You may continue");
		} else {
			System.out.println("You may continue");
		}
		
		System.out.println();
		System.out.println("Best practice use braces even with a 1 line code block");
		int guessed = 10;
		if (num1 == guessed)  {
			System.out.println("You are the winner!");
			System.out.println("Here is a million dollars!");
		}
			
		String p = new String("Percy");
		String p2 = "Percy";
		
		System.out.println("\nStrings:");
		System.out.println("\tstr1 = " + str1);
		System.out.println("\tstr2 = " + str2);
		System.out.println("\tstr3 = " + str3);
		System.out.println("\tp = " + p);
		System.out.println("\tp2 = " + p2);
		System.out.println();

		System.out.println("Comparing \"" + str1 + "\" with \"" + p + "\"");

		// This compares that the object reference variables are referring to 
		//  the same object, NOT that they have the same value
		System.out.print("\twith == : ");
		if(str1 == p) {
			System.out.println("Same name");
		}
		else {
			System.out.println("Different name");
		}

		System.out.print("\twith .equals : ");
		if(str1.equals(p)) {
			System.out.println("Same name");
		}
		else {
			System.out.println("Different name");
		}
		
		// Use .toLowerCase when comparing strings to ignore case
		if (str3.toLowerCase().equals("GrOVeR".toLowerCase())) {
			System.out.println("Grover is ready");
		}
		else {
			System.out.println("Grover is not here");
		}
		
		// Use compareTo to compare the ordering of two strings
		if (str1.compareTo(str2) > 0 ) {
			System.out.println(str1 + " is after " + str2 + "(compareTo = " + str1.compareTo(str2) + ")");
		}
		else {
			System.out.println(str2 + " is after " + str1 + "(compareTo = " + str1.compareTo(str2) + ")");
		}
		
		if (str2.compareTo(str3) < 0 ) {
			System.out.println(str3 + " is after " + str2 + "(compareTo = " + str2.compareTo(str3) + ")");
		}
		else {
			System.out.println(str2 + " is after " + str3 + "(compareTo = " + str2.compareTo(str3) + ")");
		}

		System.out.println();
		// Compound boolean statements
		if ((num1 > num2) && (str1.compareTo(p) == 0)) {
			System.out.println("if case is true");
		}
		else {
			System.out.println("if case is false (in else)");
		}
		
		// Switch
		System.out.println();
		System.out.println("switch statement");
		System.out.println("num1 = " + num1);
		
		switch(num1) {
		case 5:
			System.out.println("Five");
			break;
		case 10:
			System.out.println("Ten");
			break;
		case 20:
			System.out.println("Twenty");
			break;
		default:
			System.out.println("Number");
			break;
		}
		
		System.out.println();
		System.out.println("num2 = " + num2);
		switch(num2) {
			case 10:
			case 15:
			case 20:
			case 30:
				System.out.println("Full access");
				break;
			default:
				System.out.println("Limited access");
				break;
		}
	
	}
}
