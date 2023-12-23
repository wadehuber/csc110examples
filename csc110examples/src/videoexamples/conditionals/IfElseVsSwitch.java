package videoexamples.conditionals;

import java.util.Scanner;

public class IfElseVsSwitch {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		
		// Prompt for an integer
		System.out.println("Enter your favorite integer: ");
		int num = scnr.nextInt();
		System.out.println("You entered " + num);
		
		System.out.println("Using an if-else:");
		if (num == 1) {
			System.out.println("You entered a one");
		}
		if (num == 2) {
			System.out.println("Deuces wild!");
		}
		if (num == 5) {
			System.out.println("Five & 10");
		}
		else {
			System.out.println("You entered a " + num);
		}

		System.out.println();
		System.out.println("Using a switch:");
		switch(num) {
		case 1:
			System.out.println("You entered a one");
			break;
		case 2:
			System.out.println("Deuces wild!");
			break;
		case 5:
			System.out.println("Five & 10");
			break;
		default:
			System.out.println("You entered a " + num);
		}
		
		scnr.close();
	}

}
