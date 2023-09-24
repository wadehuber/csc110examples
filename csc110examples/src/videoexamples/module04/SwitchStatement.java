package videoexamples.module04;

import java.util.Random;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter your favorite integer: ");
		int input = scnr.nextInt();
		System.out.println();
		System.out.println("1 - Divide your number by 2");
		System.out.println("2 - Square your number");
		System.out.println("3 - Take the square root of your number");
		System.out.println("Enter a number 1-3: ");
		int choice = scnr.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Half of " + input + " = " + (input / 2));
			break;
		case 2:
			System.out.println(input + " squared = " + (input * input));
			break;
		case 3:
			System.out.println("The square root of " + input + " = " + Math.sqrt(input));
			break;
		}
		
		scnr.close();
	}

}
