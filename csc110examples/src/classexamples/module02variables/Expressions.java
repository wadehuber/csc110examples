package classexamples.module02variables;

import java.util.Scanner;

public class Expressions {
	
	public static void main (String args[]) {
	
		System.out.println("Expressions:");
		int num;
		num = 3 + 4;
		System.out.println("\tExample 1: " + num);
		System.out.println("\tExample 2: " + 3 + 4);       // concatenation
		System.out.println("\tExample 3: " + (3 + 4));     // addition
		System.out.println("\tExample 4: " + (13 / 4));    // integer division
		System.out.println("\tExample 4: " + (13 / 4.0));  // division

		int a = 7;
		int b = 3;
		
		double m = .99;
		double n = 12345 / 678.0;
		
		System.out.println("a = " + a + " b = " + b);
		System.out.println("m = " + m + " n = " + n);
		
		int x = a * a + 4 * b;
		System.out.println("a * a + 4 * b = " + (a * a + 4 * b));
		System.out.println("x = " + x);
		System.out.println("x * 10 = " + (x * 10));
		
		x = x * x;
		System.out.println("x = " + x);
		
		// Constants
		System.out.println("\nConstants:");
		final int MAX_NUMBER = 4;
		System.out.println("\tMAX_NUMBER = " + MAX_NUMBER);
		//MAX_NUMBER = 10;  // Not allowed = MAX_NUMBER is a constant (final)
		
		int value1 = 5;
		int value2 = 7;
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

		scan.close();
	}

}
