package classexamples.module3;

import java.util.Random;
import java.util.Scanner;

public class UsingClasses {


	public static void main(String[] args) {
		
		// Primitive variables hold a value
		double area = 0.5 * 10 * 5;
		int num = 17;
		System.out.println("Area = " + area);
		System.out.println("Num = " + num);
		
		System.out.println();
		
		// Create a string object
		String movie = new String("Superman");
		int movieLength = movie.length();   // use a String method
		System.out.println(movie + " is " + movieLength + " characters long");
		System.out.println("movie.toUpperCase: " + movie.toUpperCase());
		System.out.println("movie.charAt(0): " + movie.charAt(0));
		System.out.println("movie.charAt(): 1=" + movie.charAt(1) + " 2=" + movie.charAt(2));
		System.out.println("movie.charAt(): 4=" + movie.charAt(4) + " 7=" + movie.charAt(7));
		
		System.out.println();

		// Scanners
		Scanner scan = new Scanner(System.in);
		
		/*
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
		*/
		
		// The Random class
		Random rnd = new Random();
		System.out.println("java.util.Random functions:");
		System.out.println("\tnextInt(): " + rnd.nextInt());
		System.out.println("\tnextInt(): " + rnd.nextInt());
		System.out.println("\tnextInt(): " + rnd.nextInt());
		System.out.println("\tnextInt(52): " + rnd.nextInt(52)); // 0 - 51
		System.out.println("\tnextInt(52): " + rnd.nextInt(52));
		System.out.println("\tnextInt(52): " + rnd.nextInt(52));
		System.out.println("\tnextInt(52)+1: " + (rnd.nextInt(52)+1));  // 1-52
		System.out.println("\tnextInt(52)+1: " + (rnd.nextInt(52)+1));
		System.out.println("\tnextInt(52)+1: " + (rnd.nextInt(52)+1));
		System.out.println("\tnextFloat(): + " + rnd.nextFloat());
		System.out.println("\tnextFloat(): + " + rnd.nextFloat());
		System.out.println("\tnextFloat(): + " + rnd.nextFloat());
		
		// The Math class (static methods)
		System.out.println("\njava.lang.Math functions:");
		System.out.println("\tMath.E: " + Math.E);
		System.out.println("\tMath.PI: " + Math.PI);
		System.out.println("\tMath.max(10,15): " + Math.max(10,15));
		System.out.println("\tMath.min(10,15): " + Math.min(10,15));
		System.out.println("\tMath.abs(-10): " + Math.abs(-10));
		System.out.println("\tMath.cos(Math.PI / 2): " + Math.cos(Math.PI / 2));
		System.out.println("\tMath.cos(Math.PI / 4): " + Math.cos(Math.PI / 4));
		System.out.println("\tMath.sin(Math.PI / 4): " + Math.sin(Math.PI / 4));
		System.out.println("\tMath.tan(Math.PI / 4): " + Math.tan(Math.PI / 4));


		// Wrapper
		System.out.println("Wrapper classes:");
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		
		System.out.println("\"234\"+1000 = " + ("234" + 1000));
		System.out.println("Integer.parseInt(\"234\")+1000 = " + (Integer.parseInt("234") + 1000));
		System.out.println("Ineger.toHexString(111) = " + Integer.toHexString(111));

		scan.close();
	}

}
