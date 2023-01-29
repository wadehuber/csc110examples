package videoexamples.module03;

import java.util.Random;
import java.util.Scanner;

public class IfElse {

	private static final int MAX_VALUE = 20;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();

		int secret = rand.nextInt(10) + 1;  // Random number 1-10
		
		System.out.println("Pick a number between 1 & 10: ");
		int guess = scnr.nextInt();

		if (secret == guess) {
			System.out.println("You guessed the right number!");
		}
		else {
			System.out.println("Sorry, the correct number was " + secret + ".");
		}
		scnr.close();
	}

}
