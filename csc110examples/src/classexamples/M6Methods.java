package classexamples;

import java.util.Scanner;

public class M6Methods {
	
	// Print a banner
	public static void printBanner() {
		System.out.println();
		System.out.println("==========================================");
		System.out.println();
	}
	
	public static int addUpTo(int num) {
		int sum = 0;
		for (int ii=1;ii<=num;ii++) {
			sum += ii;
		}
		return sum;
	}

	// Method that calls another method
	public static void printSumTo(int num) {
		System.out.println("The sum of the numbers from 1 through " + 
							num + " is " + addUpTo(num));
	}
	
	// Overloaded method - different signatures
	// Method with one parameter
	public static void printNTimes(String str) {
		for (int ii=0;ii<10;ii++) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	// Method with two parameters
	public static void printNTimes(String str, int count) {
		for (int ii=0;ii<count;ii++) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	// Opening a Scanner inside a method (do NOT forget to close!)
	public static void promptToMultiPrint() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		
		System.out.print("How many times should I print? ");
		int num = scan.nextInt();
	
		printNTimes(input, num);
		
		scan.close();    // ALWAYS close your resources
	}

	public static void main(String[] args) {
		
		printBanner();

		printSumTo(10);
		printSumTo(15);
		printSumTo(100);
		
		printBanner();
		
		printNTimes("Hello world!", 3);
		printNTimes("XYZ");  
		printNTimes("XYZ", 12);

		printBanner();
		
		promptToMultiPrint();

		printBanner();
	}

}
