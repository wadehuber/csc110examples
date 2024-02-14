package classexamples;

import java.util.Random;
import java.util.Scanner;

public class M3ClassesAndObjects {

	public static void main(String[] args) {
		
		System.out.println("Primitive variables");
		int num = 10;       // 10 is an integer literal
		double pi = 3.14;   // 3.14 is a double literal
		char grade = 'A';   // 'A' is a character literal
		System.out.print("Values: num=" + num + ", pi=" + pi);
		System.out.println(", grade=" + grade);
		System.out.println();
		
		System.out.println("Object reference variables");
		String subject = "Computer Science";  // "Comp..Sci" is a string literal
		String movie = new String("Interstellar");  // instantiating a string
		System.out.println("subject = \"" + subject + "\"");
		System.out.println("movie = \"" + movie + "\"");

		// Methods
		System.out.println("The string '" + movie + "' is " + 
							movie.length() + " characters long");
		System.out.println();
		
		// Objects
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Using a Random object");
		System.out.println("Random integer: " + rand.nextInt());
		System.out.println("Random integer (0-9): " + (rand.nextInt(10)));
		System.out.println("Random integer (1-10): " + (rand.nextInt(10)+1));
		System.out.println("Random double: " + rand.nextDouble());
		System.out.println("Random long: " + rand.nextLong());
		System.out.println();
		
		// Static methods in Math
		System.out.println("Using static methods from the Math class");
		System.out.println("PI = " + Math.PI);
		System.out.println("sin(pi) = " + Math.sin(Math.PI));
		System.out.println("square root of 25 = " + Math.sqrt(25));
		System.out.println("square root of 42 = " + Math.sqrt(42));
		System.out.println("2 raised to the power of 8 = "+ Math.pow(2,  8));
		System.out.println("7 raised to the power of 3 = "+ Math.pow(7,  3));
		
	}

}
