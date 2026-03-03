package classexamples.module06methods;

import java.util.Scanner;

public class Methods {
	
	public static void printSeparator() {
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
	}
	
	// Returns the square of a number
	public static int square(int n) {
		return n * n;
	}
	
	// Calculate the sum of the numbers 1 up to x
	public static int addUpTo(int x) {
		int sum = 0;
		
		for (int ii=0;ii<=x;ii++) {
			sum += ii;
		}
		return sum;
	}
	
	// Method that calls another method
	public static void printSumTo(int num) {
		System.out.println("The sum up to " + num + " is " + addUpTo(num));
	}
	
	// Overloaded methods
	public static void printNTimes(String str) {
		printNTimes(str, 5);
	}
	public static void printNTimes(String str, int n) {
		for (int ii=0;ii<n;ii++) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	// Open Scanner inside a method (DO NOT FORGET TO CLOSE IT!!)
	public static void promptToMultiPrint() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: " );
		String input = scan.nextLine();
		
		System.out.print("How many times should I print? ");
		int count = scan.nextInt();
		
		printNTimes(input, count);
		
		scan.close();
	}
	
	public static int addTogether(int x, int y) {
		System.out.printf("addTogether START: x=%d, y=%d\n", x, y);
		x = x + y;
		System.out.printf("addTogether SUM  : x=%d, y=%d\n", x, y);
		return x;
	}

	public static void main(String[] args) {
		
		printSeparator();
		
		for(int ii=1;ii<=10;ii++) {
			System.out.print(square(ii) + " ");
		}
		System.out.println();

		printSeparator();
		
		System.out.println("Add up to: ");
		for(int ii=1;ii<=10;ii++) {
			System.out.print(addUpTo(ii) + " ");
		}
		System.out.println();
		
		printSeparator();
		
		System.out.println("printSumTo: calls addUpTo");
		for(int ii=1;ii<=14;ii+=3) {
			System.out.print("  ");
			printSumTo(ii);
		}

		printSeparator();
		
		System.out.println("printNTimes: overloaded Method");
		for(int ii=1;ii<=10;ii+=3) {
			System.out.print("  ");
			printNTimes("Hello",ii);
		}
		System.out.print("  ");
		printNTimes("World");
		System.out.print("  ");
		printNTimes("CSC110");

		printSeparator();
		
		promptToMultiPrint();
		
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
	}
}
