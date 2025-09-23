package classexamples.module05loops;

import java.util.Random;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Random rand = new Random();
		//Scanner scan = new Scanner(System.in);
		//System.out.print("Enter a number: ");
		//int limit = scan.nextInt();
		int limit = 11;
	
		// While Loop - repeats while a condition is true
		System.out.println("While loop:");
		int num = 1;
		while (num <= limit) {
			System.out.print(" " + num);
			++num;
		}
		System.out.println();
		
		System.out.println("While loop running total:");
		int total = 0;
		num = 1;
		while (num <= limit) {
			total += num;
				++num;
		}
		System.out.println("  The total is: " + total);
		
		System.out.println("While loop until condition is met:");
		total = 0;
		int tries = 1;
		while (total <= 1000) {
			num = rand.nextInt(100);
			System.out.print(" " + num);
			total += num;   // Keeps track of the total
			tries ++;       // Keeps track of how many random numbers
		}
		System.out.println("\n  The total is: " + total + " (" + tries + ")");
		
		// Do-While Loop (or Do Loop) - do something, then repeat while a condition is true
		num = 1;
		System.out.println("Do-While Loop: ");
		do {
			System.out.print(" " + num);
			++num;
		} while (num <= limit);
		System.out.println();
		
		// For Loop: for X = 1 to limit
		System.out.println("For Loop: ");
		for (int ii=0; ii<10; ii++) {
			System.out.print(" " + ii);
		}
		System.out.println();

		// For 1 to 10
		for (int ii=1; ii<=10; ii++) {
			System.out.print(" " + ii);
		}
		System.out.println();
		
		// Nested loops
		System.out.println();
		System.out.println("Nested loop:");
		// if limit is even, print a square, if it is odd print a triangle
		if (limit % 2 == 0) {   // limit is even
			for(int row=1; row<=5; ++row) {
				for (int col=1; col<=5; ++col) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else {  // limit is odd
			for(int row=1; row<=5; ++row) {
				for (int col=1; col<=5; ++col) {
					System.out.print("*");
				}
				System.out.println();
			}
		}


	}

}
