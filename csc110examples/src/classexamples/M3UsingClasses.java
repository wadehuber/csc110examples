package classexamples;

import java.util.Random;
import java.util.Scanner;

public class M3UsingClasses {

	public static void main(String[] args) {
		// Beware of smart quotes in code pasted from a document
		double area = 0.5 * 10 * 5;
		// System.out.println("Area = “ + area);
		System.out.println("Area = " + area);
		
		String movie = "The Thing From Another World";
		System.out.println("The string \"" + movie + "\" is " + movie.length() + " characters long");
		
		
		Scanner scan = new Scanner(System.in);
		
		/*
		// Read a number
		System.out.print("Enter a number 1-100: ");
		int num = scan.nextInt(); // reads an integer 
		System.out.println("You entered: " + num);
		
		// Read a word
		System.out.print("Enter a word : ");
		String word = scan.next(); // reads a word 
		System.out.println("You entered: " + word);

		// Read another word
		System.out.print("Enter a nother word : ");
		String anotherword = scan.next(); // reads another  word 
		System.out.println("You entered: " + anotherword);

		scan.nextLine();  // clean up the rest of the input & ignore
		
		// Read a line
		System.out.print("Enter a sentence: ");
		String sentence = scan.nextLine(); // reads a full line
		System.out.println("You entered: \"" + sentence + "\"");
		
		*/
		// The Random class
		Random rnd = new Random();
		System.out.println("Random Numbers:");
		System.out.println("\tnextInt(): " + rnd.nextInt());
		System.out.println("\tnextInt(): " + rnd.nextInt());
		System.out.println("\tnextInt(): " + rnd.nextInt());
		System.out.println("\tnextInt(52): " + rnd.nextInt(52));
		System.out.println("\tnextInt(52): " + rnd.nextInt(52));   // 0 - 51
		System.out.println("\tnextInt(52)+1: " + rnd.nextInt(52+1));   // 1 - 52
		System.out.println("\tnextInt(52)+1: " + rnd.nextInt(52+1));   // 1 - 52
		System.out.println("\tnextFloat(): " + rnd.nextFloat());
		System.out.println("\tnextFloat(): " + rnd.nextFloat());
		System.out.println("\tnextFloat(): " + rnd.nextFloat());
		
		// The Math Class (static methods)
		System.out.println("\njava.lang.Math funcgtions:");
		System.out.println("\tMath.E: " + Math.E);
		System.out.println("\tMath.PI: " + Math.PI);
		System.out.println("\tMath.max(10,15): " + Math.max(10,15));
		System.out.println("\tMath.min(10,15): " + Math.min(10,15));
		System.out.println("\tMath.abs(-10): " + Math.abs(-10));
		System.out.println("\tMath.cos(Math.PI / 2): " + Math.cos(Math.PI / 2));
		System.out.println("\tMath.cos(Math.PI / 4): " + Math.cos(Math.PI / 4));
		System.out.println("\tMath.sin(Math.PI / 4): " + Math.sin(Math.PI / 4));
		System.out.println("\tMath.tan(Math.PI / 4): " + Math.tan(Math.PI / 4));

		// Wrapper classes
		System.out.println("Wrapper classes:");
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		
		System.out.println("\"234\"+1000 = " + ("234" + 1000));
		System.out.println("Integer.parseInt(\"234\")+1000 = " + (Integer.parseInt("234") + 1000));
		System.out.println("Ineger.toHexString(111) = " + Integer.toHexString(111));

		scan.close();
	}

}
