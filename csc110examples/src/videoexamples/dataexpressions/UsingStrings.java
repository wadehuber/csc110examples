package videoexamples.dataexpressions;

import java.util.Scanner;

public class UsingStrings {

	public static void main(String[] args) {
		String myStr1 = "Hello";
		String myStr2 = "CSC110";
		
		System.out.println("Hello, world!");
		System.out.println(myStr1 + " there!");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = scan.nextLine();
		
		System.out.println(myStr1 + ", " + name);
		System.out.println("Welcome to " + myStr2);

	}

}
