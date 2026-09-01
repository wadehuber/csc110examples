package classexamples.module02variables;

public class Variables {

	public static void main(String[] args) {
		// Strings
		System.out.print("CSC110 ");
		System.out.println("Module 2");
		
		System.out.println("String" + "Concatenation");
		System.out.println(4 + "Count=" + 2 + 8);
		
		System.out.println("When one door closes, another opens; but we often " 
				+ "look so long and so regretfully upon the closed door that we do "
				+ "not see the one which has opened for us.");
		
		// Escape sequences
		// \n : newline
		// \t : tab
		// \" : double-quote
		// \\ : backslash
		System.out.println("The greatest enemy of knowledge is not \n" 
				+ "\tignorance, it is the illusion of \n" 
				+ "\tknowledge. - Stephen Hawking");
		// System.out.println(""To be, or not to be"");
		System.out.println("\"To be, or not to be\"");
		
		// Be careful with editors that have smart quotes!
		// Syntax error on token "Invalid Character", @ expected
		// System.out.println(“This is text copied from Google docs”);
		System.out.println("This is text copied from Google docs");
		
		// Variables
		int value1;      // Declare a variable (with a bad name!)
		int value2 = 5;  // Declare and initialize a variable
		
		value1 = 2;      // Set a variable's value
		
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		
		// Be careful with + : sometimes addition, sometimes concatenation!
		System.out.println("\"value1 + value1\" = " + value1 + value2);
		System.out.println("\"(value1 + value1)\" = " + (value1 + value2));
		
		// Primitive data type
		int number = 10;
		long bigNumber = 1234567890L;  // L indicates this is a long literal 
		double realNumber = 3.14159;   // floating-point number
		boolean decision = true;       // true or false
		char letter = 'A';             // single character in single quotes
		char backslash = '\\';         // single (escaped) character in single quotes

		System.out.println("\nPrimitive types");
		System.out.println("\tint number = " + number);
		System.out.println("\tlong bigNumber = " + bigNumber);
		System.out.println("\tdouble realNumber = " + realNumber);
		System.out.println("\tboolean decision = " + decision);
		System.out.println("\tchar letter = " + letter);

		// char is a numeric type
		letter = 'A' + 1;
		System.out.println('A' + 1);
		System.out.println(letter);
		
		
	}

}
