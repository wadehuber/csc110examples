package classexamples.module03objects;

import java.util.Scanner;

public class UsingClasses {

	public static void main(String[] args) {

		// Primitive variables hold a value
		double area = 0.5 * 10 * 5;
		int num = 17;
		System.out.println("Area = " + area);
		System.out.println("Num = " + num);
		
		System.out.println();
		String movie = "Mad Max: Fury Road";
		int movieLength = movie.length();
		movie.toUpperCase();
		System.out.println("movie = " + movie);
		System.out.println(movie + " is " + movieLength + " characters long.");
		System.out.println("movie.toUpperCase(): " + movie.toUpperCase());
		System.out.println("movie = " + movie);
		System.out.println("movie.toLowerCase(): " + movie.toLowerCase());
		
		// Wrapper classes
		System.out.println("\nWrapper classes:");
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("\"234\" + 1000 = " + ("234" + 1000));
		System.out.println("Integer.parseInt(\"234\") + 1000 = " + 
		                    (Integer.parseInt("234") + 1000));
		System.out.println("Integer.toHexString(111) = " + Integer.toHexString(111));
		System.out.println("Integer.toHexString(1234567) = " + Integer.toHexString(1234567));

		// Scanners
		Scanner scan = new Scanner(System.in);
		
		// Read a number
		System.out.print("Enter a number 1-100: "); 
		num = scan.nextInt();  // reads an integer
		System.out.println("You entered: " + num);
		System.out.println();

		// Read a word
		System.out.print("Enter a word: "); 
		String word = scan.next();  // reads a String
		System.out.println("You entered: " + word);
		System.out.println();
		
		// Read a word
		System.out.print("Enter a another word: "); 
		String anotherWord = scan.next();  // reads a String
		System.out.println("You entered: " + anotherWord);
		System.out.println();
		
		scan.nextLine();   // cleans up the rest of the input
	
		// Read a line
		System.out.print("Enter a sentence: " );
		String sentence = scan.nextLine();  // reads a full line
		System.out.println("You entered: \"" + sentence + "\"");

	}

}
