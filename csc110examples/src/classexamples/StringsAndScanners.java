package classexamples;

import java.util.Scanner;

public class StringsAndScanners {

	public static void main(String[] args) {
		// Examples of quotes 
		//  System.out.println('Roads?');  // Can't use single quotes
		System.out.println('"');
		System.out.println("Roads?");
		System.out.println("Where we're going we don't need roads.");
		
		// Strings
		String str = "This is a string literal";  // String variable
		System.out.println("String str: '" + str + "'");
		
		// Getting user input
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter a number: ");
		int userInput = scan.nextInt();
		System.out.println("You entered " + userInput);
		
		System.out.println();
		System.out.println("Enter a word: ");
		String word = scan.next();
		System.out.println("You entered '" + word + "'");
		
		scan.nextLine();  // Cleans out the current line of input
		System.out.println();
		System.out.println("Enter a sentence : ");
		String sentence = scan.nextLine();
		System.out.println("You entered '" + sentence + "'");
		
		scan.close();

	}

}
