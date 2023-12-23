package videoexamples.loops;

import java.util.Scanner;

public class ValidatingInput {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a positive number (0 to quit): ");
		num = scnr.nextInt();

		while( (num <= 0) || (num >10) ) {
			System.out.print("Enter a number (1-10): ");
			num = scnr.nextInt();
		}
		System.out.println("Thanks for playing!");
		scnr.close();
	}

}
