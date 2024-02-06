package classexamples;

public class data {

	public static void main(String[] args) {
		System.out.print("CSC110 ");
		System.out.println("Module 2");
		
		System.out.println("Pulp " + "Fiction");
		
		// \n : newline    \t : tab
		System.out.println("The greatest enemy of knowledge is not \n" +
				           "\tignorance, it is the illusion of \n" + 
         				   "\tknowledge. - Stephen Hawking");

		// Be careful with editors that have smart quotes!
		// Syntax error on token "Invalid Character", @ expected
		// System.out.println(“This is text copied from google docs”);

		int value1;        // declare a variable
		int value2 = 5;    // declare & initialize a variable
		
		value1 = 2;        // set a variable's value
		
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		
		value2 = 7;
		System.out.println("setting value2 = 7");
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		
		// Primitive data types
		int number = 10;
		long bigNumber = 12345677890L;   // need L at the end to indicate long literal
		double realNumber = 3.14159;
		boolean decision = true;
		char letter = 'A';
		
		System.out.println("\nPrimitive types");
		System.out.println("\tint number = " + number);
		System.out.println("\tlong bigNumber = " + bigNumber);
		System.out.println("\tdouble realNumber = " + realNumber);
		System.out.println("\tboolean decision = " + decision);
		System.out.println("\tchar letter = " + letter);
	
		letter = 'A' + 15;
		System.out.println("\tchar letter = " + letter);
		
		System.out.println("\nExpressions");
		System.out.println("\tExample1: " + 3 * 4);
		System.out.println("\tExample2: " + 3 + 4);     // 3 & 4 get concatenated
		System.out.println("\tExample3: " + (3 + 4));   // 3 & 4 get added
		System.out.println("\tExample3: " + (3 / 4));   // integer division
		System.out.println("\tExample3: " + (3 / 4.0)); // integer division
		
		System.out.println("\t39 / 7 = " + (39 / 7));  // integer division
		System.out.println("\t39 % 7 = " + (39 % 7));  // modulo (remainder) operator

		// Constants
		System.out.println("Constants");
		final int MAX_NUMBER = 4;
		System.out.println("\tMAX_NUMBER = " + MAX_NUMBER);
		//  MAX_NUMBER = 10;  // Not allowed - MAX_NUMBER is a constant (final)

		System.out.println();
		System.out.println("Shortcuts");
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		value1 ++;
		value2 += MAX_NUMBER;
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		
		
	}

}
