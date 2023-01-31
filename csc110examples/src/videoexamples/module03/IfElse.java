package videoexamples.module03;

import java.util.Random;
import java.util.Scanner;

public class IfElse {

	private static final int MAX_VALUE = 10;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();

		int secret = rand.nextInt(MAX_VALUE) + 1;  // Random number 1-MAX_VALUE
		System.out.println("Pick a number between 1 & " + MAX_VALUE + ": ");
		int guess = scnr.nextInt();

		if (secret == guess) {
			System.out.println("You guessed secret number!");
		}
		else {
			System.out.println("Sorry, that's wrong - the secret number was " + secret);
		}

		scnr.close();
	}

}
