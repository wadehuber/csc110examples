package classexamples.module03objects;

import java.util.Random;

public class ClassesAndObjects {

	public static void main(String[] args) {

		System.out.println("Primitive variables");
		int num = 10; // 10 is an integer literal
		double pi = 3.14; // 3.14 is a double literal
		char grade = 'A'; // 'A' is a character literal
		System.out.print("Values: num=" + num + ", pi=" + pi);
		System.out.println(", grade=" + grade);
		System.out.println();

		System.out.println("Object reference variables");
		String movie = "Spider-Man: No Way Home";
		int len = movie.length();
		System.out.println("len = " + len);
		System.out.println("movie.length() + 1 = " + (movie.length() + 1));

		String subject = "Computer Science"; // "Computer Science" is a string literal
		len = subject.length();
		System.out.println("len = " + len);
		System.out.println("subject.length() + 1 = " + (subject.length() + 1));

		// The Random Class
		Random rand = new Random();
		System.out.println("Using a Random object:");
		System.out.println("\tRandom integer: " + rand.nextInt());
		System.out.println("\tRandom integer [0-9]: " + rand.nextInt(10));
		System.out.println("\tRandom integer [1-10]: " + (rand.nextInt(10) + 1));
		System.out.println("\tRandom double: " + rand.nextDouble());
		System.out.println("\tRandom long: " + rand.nextLong());
		System.out.println();

		Random rand2 = new Random(13); // Seed value
		System.out.println("\tRandom integer [1-10]: " + (rand2.nextInt(10) + 1));
		System.out.println("\tRandom integer [1-10]: " + (rand2.nextInt(10) + 1));
		System.out.println("\tRandom integer [1-10]: " + (rand2.nextInt(10) + 1));

		// The Math class (static methods)
		System.out.println("\nUsing static methods from the Math class:");
		System.out.println("\tSquare root of 25 = " + Math.sqrt(25));
		System.out.println("\tSquare root of 42 = " + Math.sqrt(42));
		System.out.println("2 raised to the power of 8 = " + Math.pow(2, 8));
		System.out.println("3 raised to the power of 4 = " + Math.pow(3, 4));
		System.out.println("7 raised to the power of 5 = " + Math.pow(7, 5));
		System.out.println("11 raised to the power of 12 = " + Math.pow(11, 12));
		System.out.println("PI = " + Math.PI);
		System.out.println("cos(pi) = " + Math.cos(Math.PI));
		System.out.println("sin(pi) = " + Math.sin(Math.PI));
		System.out.println("sin(45 deg) = " + Math.sin(Math.toRadians(45)));
		System.out.println("Absolute value of 10 = " + Math.abs(10));
		System.out.println("Absolute value of -10 = " + Math.abs(-10));
		System.out.println("Rounding 12.34 = " + Math.round(12.34));
		System.out.println("Rounding 56.78 = " + Math.round(56.78));
		System.out.println("Maximum of 10 & 20 = " + Math.max(10, 20));
		System.out.println("Minimum of 10 & 20 = " + Math.min(10, 20));

	}

}
