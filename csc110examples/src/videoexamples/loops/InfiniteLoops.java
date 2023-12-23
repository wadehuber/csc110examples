package videoexamples.loops;

import java.util.Scanner;

public class InfiniteLoops {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean done = false;
		int input;
		
		do {
			System.out.println("Enter an even number: ");
			input = scnr.nextInt();
			scnr.nextLine();
			if ((input % 2) == 0) {
				done = true;
			}
			
		} while(!done);

		System.out.println("You entered " + input);
		System.out.println("");

		while(true) {
			System.out.println("Now enter an odd number: ");
			input = scnr.nextInt();
			scnr.nextLine();
			if ((input % 2) == 1) {
				break;
			}
		}
		System.out.println("You entered " + input);
		
		scnr.close();
	}
}
