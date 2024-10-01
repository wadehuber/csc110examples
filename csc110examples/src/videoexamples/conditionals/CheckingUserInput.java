package videoexamples.conditionals;

import java.util.Scanner;

public class CheckingUserInput {

	public static void main(String[] args) {
		final int MIN = 5;
		final int MAX = 200;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number between " + MIN + " & " + MAX + ": ");
		int userInput = scan.nextInt();
		
		if ((userInput > MIN) && (userInput < MAX)) {
			System.out.print("You entered a " + userInput);
		}
		else {
			System.out.println("Invalid entry");
		}
		
		scan.close();
	}

}
