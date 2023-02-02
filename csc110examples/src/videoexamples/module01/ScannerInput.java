package videoexamples.module01;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// create a new object for reading input
		Scanner scnr = new Scanner(System.in);

		int num;           // Integer variable
		String sentence;   // String variable
		
		System.out.println("Enter a number: ");
		num = scnr.nextInt();  // Read in an integer
		scnr.nextLine();       // This reads the rest of the line so 
		                       //   we are ready to read more input
		
		System.out.println("Enter a sentence: ");
		sentence = scnr.nextLine();  // Read in an entire line
		
		// Display the values we read on the console
		System.out.println("Number = " + num);
		System.out.println("Sentence = " + sentence);
		
		scnr.close();   // We are done with the Scanner, so close it
	}

}
