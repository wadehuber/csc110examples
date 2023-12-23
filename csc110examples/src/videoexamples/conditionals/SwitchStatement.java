package videoexamples.conditionals;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		
		// Prompt for an integer
		System.out.println("Enter your favorite integer: ");
		int input = scnr.nextInt();
		System.out.println();
		
		// Printing a menu
		System.out.println("1 - Divide your number by 2");
		System.out.println("2 - Square your number");
		System.out.println("3 - Take the square root of your number");
		System.out.println("Enter a number 1-3: ");
		int choice = scnr.nextInt();

		System.out.println("You entered " + input + " and option " + choice);
		
		switch(choice) {
		case 1:
			System.out.println(input + " divided by 2 is " + (input / 2));
			break;
		case 2:
			System.out.println(input + " squared is " + (input * input));
			break;
		case 3:
			System.out.println("The square root of " + input + " is " + Math.sqrt(input));
			break;
		default:
			System.out.println("Invalid option chosen");
		}
			

		scnr.close();
	}

}
