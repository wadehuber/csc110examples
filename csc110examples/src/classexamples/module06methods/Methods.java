package classexamples.module06methods;

import java.util.Scanner;

public class Methods {
	
	// Print a separating line
	public static void printSeparator() {
		System.out.println();
		System.out.println("=====================================================");
		System.out.println();
	}

	// Returns the square of a number
	public static int square(int n) {
		return n * n;
	}

	// Calculate the sum of the numbers up to x
	public static int addUpTo(int x) {
		int sum = 0;
		for (int ii=1; ii<=x; ii++) {
			sum += ii;
		}
		return sum;
	}
	
	// Overloaded method
	public static void printNTimes(String str) {
		printNTimes(str, 5);
	}
	public static void printNTimes(String str, int n) {
		for (int ii=0;ii<n;ii++) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	// Method that calls another method
	public static void printSumTo(int x) {
		System.out.println("The sum up to " + x + " is " + addUpTo(x));
	}
	
	// Use a Scanner inside a method
	public static void promptToMultiPrint(Scanner scan) {
		
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		
		System.out.print("How many times should I print? ");
		int count = scan.nextInt();
		scan.nextLine();    // Clear of input
		
		printNTimes(input, count);
		
	}
	
	public static int addTogether(int x, int y) {
		System.out.printf("addTogether START: x=%d, y=%d\n", x, y);
		x = x + y;
		System.out.printf("addTogether SUM  : x=%d, y=%d\n", x, y);
		return x;
	}
	
	public static void main(String[] args) {
		
		printSeparator();

		System.out.println("Method examples");
		
		printSeparator();
		
		System.out.print("square: ");
		for (int ii=0;ii<15;ii++) {
			System.out.print(" " + square(ii));
		}
		System.out.println();

		printSeparator();

		
		System.out.print("addUpTo: ");
		for (int ii=0;ii<15;ii++) {
			System.out.print(" " + addUpTo(ii));
		}
		System.out.println();
		
		printSeparator();

		printSumTo(5);
		printSumTo(13);
		printSumTo(77);
		
		printSeparator();

		printNTimes("Hello");
		printNTimes("Hello", 6);
		printNTimes("X", 20);

		printSeparator();

		Scanner scan = new Scanner(System.in);
		promptToMultiPrint(scan);
		promptToMultiPrint(scan);
		scan.close();
		
		printSeparator();

		System.out.println("addTogether Testing");
		int x = 10;
		int y = 17;
		int a = 4;
		int b = 6;
		
		System.out.printf("Initial: x=%d, y=%d, a=%d, b=%d\n", x, y, a, b);
		addTogether(x,y);
		System.out.printf("After X&Y: x=%d, y=%d, a=%d, b=%d\n", x, y, a, b);
		addTogether(a,b);
		System.out.printf("After A&B: x=%d, y=%d, a=%d, b=%d\n", x, y, a, b);

		printSeparator();
		
		System.out.println("The End");
		
		printSeparator();

	}
}
