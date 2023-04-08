package videoexamples.module16exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {

	public static int checkThisOut() {

		int num = 0;
		
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.print("Enter a number : ");
			num = in.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("You did not enter a valid input!");
			return -1;
		} 
		finally {
			System.out.println("Your result is going to be " + num);
			in.close();
		}

		return num;
	}


	public static void main(String[] args) {
		int num;
		
		num = checkThisOut();
		
		
		System.out.println("The result is " + num);
	
	}
}
