// Class examples for CSC110 Module 2 - Data & Expressions
// 27-Aug-2024

package classexamples.module02variables;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		System.out.print("CSC110 ");
		System.out.println("Module 2");
		
		System.out.println("Pulp" + " " + "Fiction");   // String concatenation
		
		// \n : newline
		// \t : tab
		// \" : double-quote
		System.out.println("The greatest enemy of knowledge is not \n" 
				+ "\tignorance, it is the illusion of \n" 
				+ "\tknowledge. - Stephen Hawking");
		//System.out.println(""To be, or not to be"");
		System.out.println("\"To be, or not to be\"");

		
		// Be careful with editors that have smart quotes!
		// Syntax error on token "Invalid Character", @ expected
		// System.out.println(“This is text copied from google docs”);
		
		// Variables
		int value1;  // declare a variable (with a bad name!)
		int value2 = 5;  // declare & initialize a variable
		
		value1 = 2;   // set a variable's value
		
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);

		// Be careful with + : sometimes addition, sometimes concatenation!
		System.out.println("\"value1+value2\" = " + value1 + value2);
		System.out.println("(value1+value2) = " + (value1 + value2));

		value2 = 13;
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		
		// Primitive data types
		int number = 10;
		long bigNumber = 12345677890L; // need L at the end to indicate long literal
		double realNumber = 3.14159;
		boolean decision = true;
		char letter = 'A';

		System.out.println("\nPrimitive types");
		System.out.println("\tint number = " + number);
		System.out.println("\tlong bigNumber = " + bigNumber);
		System.out.println("\tdouble realNumber = " + realNumber);
		System.out.println("\tboolean decision = " + decision);
		System.out.println("\tchar letter = " + letter);

		letter = 'A' + 1;
		System.out.println("\tchar letter = " + letter);

		System.out.println("\nExpressions:");
		int num;
		num = 3 + 4;
		System.out.println("\tExample 1: " + num);
		System.out.println("\tExample 2: " + 3+4);    // concatenation!
		System.out.println("\tExample 3: " + (3+4));    // addition!
		System.out.println("\tExample 2: " + (13/4));    // integer division!
		System.out.println("\tExample 2: " + (13/4.0));    // integer division!
		
		// Constants
		System.out.println("\nConstants:");
		final int MAX_NUMBER = 4;
		System.out.println("\tMAX_NUMBER = " + MAX_NUMBER);
		//MAX_NUMBER = 10;  // Not allowed = MAX_NUMBER is a constant (final)
		
		System.out.println("\nShortcuts:");
		System.out.println("\tvalue1 = " + value1);
		System.out.println("\tvalue2 = " + value2);
		value1 = value1 + MAX_NUMBER;
		++value2;
		System.out.println("\tvalue1 = " + value1);
		System.out.println("\tvalue2 = " + value2);
		value1 += MAX_NUMBER;
		value2++;
		System.out.println("\tvalue1 = " + value1);
		System.out.println("\tvalue2 = " + value2);

		// Reading input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter a number: ");
		
		int user = scan.nextInt();
		System.out.println("You entered a " + user);
	}

}
