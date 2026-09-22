package classexamples.module05loops;

import java.util.Random;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int limit = scan.nextInt();
		//int limit = 9;
		
		// While Loop - repeats while a condition is true
		int num = 1;
		while (num <= limit) {
			System.out.print(" " + num);
			num ++;
		}
		System.out.println();
		System.out.println();
		
		// Keep a running total
		System.out.println("While loop - running total:");
		num = 1;
		int total = 0;
		while(num <= limit) {
			total += num;
			num ++;
		}
		System.out.println("The total is : " + total);
		System.out.println();

		// Loop only if a condition is met
		int tries = 1;
		int secretNum = limit;
		if ((secretNum >= 1) && (secretNum <= 1000)) {
			int guess = rand.nextInt(1000) + 1;
			while (guess != secretNum) {
				tries ++;
				guess = rand.nextInt(1000) + 1;
			}
			System.out.println("It took " + tries + " to guess " + secretNum);
		}
		System.out.println();
			
		// Nested condition in a loop
		num = 1;
		int multiplesCount = 0;
		while (num <= limit) {
			// Check if num is a multiple of 3
			if (num % 3 == 0) {
				multiplesCount ++;
			}
			num ++;
		}
		System.out.println("There are " + multiplesCount + " multiples of 3 <=" + limit);
		System.out.println();
		
		int value = -1;
		total = 0;
		System.out.print("Enter a positive number (0 to quit): ");
		value = scan.nextInt();
		while (value != 0) {
			total += value;
			System.out.println("  The total so far is " + total);
			System.out.print("Enter a positive number (0 to quit): ");
			value = scan.nextInt();
		}
		System.out.println("The total is " + total);

		
		System.out.println("Do-while loops:");
		// Same thing, but with a do-while
		value = -1;
		total = 0;
		do {
			System.out.print("Enter a positive number (0 to quit): ");
			value = scan.nextInt();
			total += value;
			System.out.println("  The total is " + total);
		} while (value != 0);
		System.out.println();
		
		// do-while - execute once before checking the condition
		tries = 0;
		if ((secretNum >= 1) && (secretNum <= 1000)) {
			int guess;
			do {
				guess = rand.nextInt(1000) + 1;
				tries ++;
			} while (guess != secretNum);
			System.out.println("It too " + tries + " tries to guess the secret number " + secretNum);

		}
		System.out.println();

		// For Loops - iterate a set number of times
		System.out.println("");
		for(int ii = 1; ii<=limit; ii++) {
			System.out.print(" " + ii) ;
		}
		System.out.println();
		System.out.println();
		
		// Drawing shapes
		// Square
		for (int row=1;row<limit;row++) {
			for (int col=1;col<limit;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Triangle
		for (int row=1;row<limit;row++) {
			for (int col=1;col<row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}
