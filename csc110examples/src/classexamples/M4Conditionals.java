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
		if ((num1 + num2) < num3) {
			System.out.println("Greetings");
			System.out.println("    Thank you for coming.");
		}
		else {
			System.out.println("You are not welcome!");
		}
		
		//   If the square of num1 is less than num2 * num3
		//     display "You may continue" otherwise
		//     display "You shall not pass!"
		if (Math.pow(num1,  2) < (num2 * num3)) {
			System.out.println("You may continue");
		}
		else {
			System.out.println("You shall not pass!");
		}
		
		// Brackets around 1 line code blocks are not required, but are recommended
		int headphonePrice = 40;
		int myMoney = 20;
		if (myMoney > headphonePrice) 
			System.out.println("You can buy the headphones");
			// the following line is not part of the if block!!
			System.out.println("Enjoy listening to music");
			
		System.out.println("\nStrings:");
		System.out.println("str1 = Percy");
		System.out.println("str2 = Annabeth");
		System.out.println("str3 = Grover");
		System.out.println();

		String p = new String("Percy");
		
		// This compares that the object reference variables are referring to 
		//  the same object, NOT that they have the same value
		System.out.println("Comparning \"" + str1 + "\" with \"" + p);
		System.out.print("Comparing strings with == : ");
		if (str1 == p) {
			System.out.println("same name");
		}
		else {
			System.out.println("different name");
		}
		
		// Use .equals() to compare objects, NOT ==
		System.out.print("Comparing strings with equal() : ");
		if (str1.equals(p)) {
			System.out.println("same name");
		}
		else {
			System.out.println("different name");
		}
		
		// Use .toLowerCase() when comparing srings to ignore case
		if (str3.toLowerCase().equals("GrOveR".toLowerCase())) {
			System.out.println("Grover is ready");
		}
		else {
			System.out.println("Grover is not here");
		}
		
		// Use compareTo to compare the ordering of two strings
		if (str1.compareTo(str2) > 0 ) {
			System.out.println(str1 + " is the winner (compareTo = " + str1.compareTo(str2) + ")");
		}
		else {
			System.out.println(str2 + " is the winner (compareTo = " + str1.compareTo(str2) + ")");
		}
		
		if (str2.compareTo(str3) < 0 ) {
			System.out.println(str3 + " is the winner (compareTo = " + str2.compareTo(str3) + ")");
		}
		else {
			System.out.println(str2 + " is the winner (compareTo = " + str2.compareTo(str3) + ")");
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
		
		// Switch
		System.out.println("\nswitch statement");
		System.out.println("num1 = " + num1);
		switch (num1) {
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
				System.out.println("Something else");
				break;
		}
				
	}

}
