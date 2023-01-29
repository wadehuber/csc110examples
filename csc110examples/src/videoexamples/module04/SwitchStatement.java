package videoexamples.module04;

import java.util.Random;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter your favorite integer: ");
		int input = scnr.nextInt();
		System.out.println("Enter a number 1-3: ");
		int choice = scnr.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Half of " + input + " = " + (input/2));
				break;
			case 2:
				System.out.println(input + " squared = " + (input*input));
				break;
			case 3:
				System.out.println("The square root of " + input + " = " + Math.sqrt(input));
				break;
		}
	}
		

}
