package classexamples;

import java.util.Scanner;

public class M5Loops {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int limit = scan.nextInt();
		
		// While Loops - repeat while a condition is true
		System.out.println("While loop: ");
		int num = 1;
		while (num <= limit) {
			System.out.print(" " + num);
			num++;
		}
		System.out.println();
		
		int sum = 0;
		num = 1;
		System.out.println("Running total: ");
		while (num <= limit) {
			sum += num;   // add num to our running run
			num ++;
		}
		System.out.println("  The sum is " + sum);
		System.out.println();
		
		// Do-While Loop (or Do Loop) - do something, then repeat while a condition is true
		num = 1;
		System.out.println("Do-While Loop: ");
		do {
			System.out.print(" " + num);
			num++;
		} while(num <= limit);
		System.out.println();
		
		// For Loop: for X = 1 to limit
		System.out.println("For Loop: ");
		for (int ii=1; ii<=limit; ii++) {
			System.out.print(" " + ii);
		}
		System.out.println();
		
		// Nested loops
		System.out.println();
		System.out.println("Nested loop");
		// if limit is even, print a triangle, if it is odd print a square
		if (limit % 2 == 0) { // limit is even
			for(int row=1; row<=5; row++) {
				for(int col=1; col<=row;col++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else { // limit is odd
			for(int row=1; row<=5; row++) {
				for(int col=1; col<=5;col++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		scan.close();

	}

}
