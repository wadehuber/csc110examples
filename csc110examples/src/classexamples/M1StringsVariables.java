package classexamples;

import java.util.Scanner;

public class M1StringsVariables {
	
	public static void main(String[] args) {
	
		// String literal: "Hello, world"
		
		// Concatenate strings
		System.out.println("Hello " + "world" + "!");
		System.out.println("ABC" + 123);     // Numbers are treated like strings when you concatenate
		System.out.println("Num" + 10 + 20 + 30);   // the ints are concatenated
		System.out.println("Num" + (10 + 20 + 30));   // the ints are added first due to the ()'s
		System.out.println(10 + 20 + 30);    // No string, this is addition
		
		// Escape sequences
		// \n : newline
		// \t : tab
		// \" : double-quote
		
		System.out.println("The greatest enemy of knowledge is not ignorance, it is the illusion of knowledge. - Stephen Hawking");
		System.out.println("The greatest enemy of knowledge is not ignorance,\n" +
		                    "\t it is the illusion of knowledge.\n" +
		                    "\t\t\t- Stephen Hawking\n");
		// System.out.println(""To be, or not to be"");
		System.out.println("\"To be, or not to be\"");

		// Be careful with editors that have smart quotes!
		// Syntax error on token "Invalid Character", @ expected

		//                    v--------------- this is a smart quote
		// System.out.println(“This is text copied from google docs”);
		//                    this is a smart quote ---------------^
	
		// Variables
		int value1;       // declare a variable (with a bad name)
		int value2 = 5;   // declare & intitialize a variable
		
		value1 = 2;
		
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
	
		value1 = value1 + 7;
		value2 = value1 * 10;
		
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);

		// Be careful with + : sometimes addition, sometimes concatenation!
		System.out.println("\"value1+value2\" = " + value1 + value2);
		System.out.println("(value1+value2) = " + (value1 + value2));
	
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
		
		letter = 'A' + 1;    //  char literals are integers
		System.out.println("\tchar letter + 1 = " + letter);
		
		// Constants
		System.out.println("\nConstants:");
		final int MAX_NUMBER = 4;
		System.out.println("\tMAX_NUMBER = " + MAX_NUMBER);
		// MAX_NUMBER = 10;  // Not allowed = MAX_NUMBER is a constant (final)
		
		// Reading input from the user
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter a number: ");
		
		int user = scan.nextInt();
		System.out.println("You entered a " + user);
		
		// Expressions
		System.out.println();
		System.out.println("Expressions");
		int num;
		num = 3 + 4;
		System.out.println("\tExample 1: " + num);
		System.out.println("\tExample 2: " + 3+4);    // concatenation!
		System.out.println("\tExample 3: " + (3+4));    // addition!
		System.out.println("\tExample 4: " + (13/4));    // integer division!
		System.out.println("\tExample 5: " + (13/4.0));    // integer division!
		
		int a = 7;
		int b = 3;
		
		double m = .99;
		double n = 12345 / 678.0;
		
		System.out.println("a = " + a + " b = " + b);
		System.out.println("m = " + m + " n = " + n);
		
		int x = a * a + 4 * b;
		System.out.println("a * a + 4 * b = " + (a * a + 4 * b));
		System.out.println("a * a + 4 * b = " + a * a + 4 * b);
		System.out.println("a = " + a + " b = " + b + " x = " + x);

		System.out.println("\nShortcuts : ++, +=:");
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


	}

}
