package classexamples.module05loops;

import java.util.Random;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		//int limit = scan.nextInt();
		int limit = 9;
		
		// While Loop - repeats while a condition is true
		System.out.println("While loop:");
		int num = 1;
		while (num <= limit) {
			System.out.print(" " + num);
			++num;
		}
		System.out.println();
		
		// Keep a running total
		System.out.println("While Loop - running total:");
		num = 1;
		int total = 0;
		while (num <= limit) {
			total += num;
			++num;
		}
		System.out.println("The total is: " + total);
		System.out.println();
		
		// While Loop until a condition is met
		int tries = 1;
		// Check that the limit is valid before we begin
		if ((limit >= 1) && (limit <= 1000)) {
			int guess = rand.nextInt(1000) + 1;
			while (guess != limit) {
				tries ++;
				guess = rand.nextInt(1000) + 1;
			}
			System.out.println("It took " + tries + " tries to guess " + limit);
		}
		
		// Nested conditional in a loop
		num = 1;
		int multiplesCount = 0;
		while (num <= limit) {
			// Check if num is a multiple of 3
			if (num % 3 == 0) {
				multiplesCount ++;
			}
			num ++;
		}
		System.out.println("There are " + multiplesCount + " multiples of 3 <=15");
		System.out.println();
		
		System.out.println("Do-While Loops:");
		// Do-While Loop (or Do Loop) - execute once before checking the condition
		tries = 0;
		// Check that the limit is valid before we begin
		if ((limit >= 1) && (limit <= 1000)) {
			int guess;
			do {
				guess = rand.nextInt(1000) + 1;
				tries ++;
			} while (guess != limit);
			System.out.println("It took " + tries + " tries to guess " + limit);
		}
		System.out.println();
	
		// For Loops - iterate a set number of times
		System.out.println("For Loop:");
		// for (initialization; condition; update)
		for (int ii=1; ii<=limit; ii++) {
			System.out.print(" " + ii);
		}
		System.out.println();
		
		
		// Nested Loops
		// Times table
		System.out.println("Times Table");
		for (int ii=1; ii<=limit; ii++) {
			for (int jj=1; jj<=limit; jj++) {
				System.out.printf("%4d", ii*jj);
			}
			System.out.println();
		}
		System.out.println();
		
		// Drawing shapes
		// if limit is even, print a square, if it is odd print a triangle
		if (limit % 2 == 0) {
			for (int row=1; row <= limit; ++row) {
				for (int col=1; col <= limit; ++col) {
					System.out.print('*');
				}
				System.out.println();
			}	
		} else {
			for (int row=1; row <= limit; ++row) {
				for (int col=row; col <= limit; ++col) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
		
		scan.close();
	
	}
}
