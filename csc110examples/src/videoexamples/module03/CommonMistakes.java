package videoexamples.module03;

import java.util.Scanner;

public class CommonMistakes {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;

		System.out.println("Enter a number between 1 & 10");
		num = scnr.nextInt();
		
		/* 
		// Here we have 2 if statements that do the same thing
		if (num < 1) {
			System.out.println("Invalid input");
		}
		if (num > 10) {
			System.out.println("Invalid input");
		}
		*/

		// Instaed combine both conditions into one if statement
		if ((num < 1) || (num > 10)) {
			System.out.println("Invalid input");
		}
	
		/*
		// Here we create a boolean variable to hold our result
		boolean isInputEven = ((num % 2) == 0);
		if (isInputEven) {
			System.out.println("You entered an even number");
		}
		*/
		
		// Instead, use the boolean expression directly in the if condition
		if ((num % 2) == 0) {
			System.out.println("You entered an even number");
		}
		
		// If a number is negative, change it to its absolute value
		// Then print twice the number & the square of the number
		/*
		if (num < 0) {
			num = num * -1;
			System.out.println("Twice the number is " + 2 * num);
			System.out.println("The square of the number is " + num * num);
		}
		else {
			System.out.println("Twice the number is " + 2 * num);
			System.out.println("The square of the number is " + num * num);
		}
		*/
		
		// Instead, keep code that is not dependent on the condition outside 
		//    the if's code block
		if (num < 0) {
			num = num * -1;
		}
		System.out.println("Twice the number is " + 2 * num);
		System.out.println("The square of the number is " + num * num);

		// Or just skip the if and use Math.abs!
		num = Math.abs(num);

	}

}
