package classexamples.classexample.module3;

import java.util.Random;
import java.util.Scanner;

public class UsingClasses {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		  
		String movie = "Batman";
		
		System.out.println(movie + " has " + movie.length() + " characters");

		// System.out.print("Enter a number & I'll divide by 2:");
		// System.out.println("The result is + " + (scn.nextInt() / 2));
		
		// The Random class
		System.out.println("Random numbers:");
		System.out.println("\tnextInt(): " + rnd.nextInt());
		System.out.println("\tnextInt(): " + rnd.nextInt());
		System.out.println("\tnextInt(): " + rnd.nextInt());
		System.out.println("\tnextInt(52): " + rnd.nextInt(52));   // 0-51
		System.out.println("\tnextInt(52)+1: " + (rnd.nextInt(52)+1));   // 1-52
		System.out.println("\tnextFloat(): " + rnd.nextFloat());
		System.out.println("\tnextFloat(): " + rnd.nextFloat());
		System.out.println("\tnextFloat(): " + rnd.nextFloat());
		
		// The Math class (static methods)
		System.out.println();
		System.out.println("java.lang.Math functions:");
		System.out.println("\tMath.E: " + Math.E);
		System.out.println("\tMath.PI: " + Math.PI);
		System.out.println("\tMath.max(10,15): " + Math.max(10,15));
		System.out.println("\tMath.min(10,15): " + Math.min(10,15));
		System.out.println("\tMath.abs(-10): " + Math.abs(-10));
		System.out.println("\tMath.abs(-1 * Math.PI): " + Math.abs(-1 * Math.PI));
		System.out.println("\tMath.cos(Math.PI / 2)): " + Math.cos(Math.PI / 2));  // radians

		// Wrapper classes
		int num = 42;
		System.out.println("Wrapper classes:");
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("\"234\"+1000 = " + "234"+1000);
		System.out.println("Integer.parseInt(\"234\")+1000 = " + (Integer.parseInt("234")+1000));
		System.out.println("Integer.toHexString(111 = " + Integer.toHexString(111));
		
		
		scn.close();
	}

}
