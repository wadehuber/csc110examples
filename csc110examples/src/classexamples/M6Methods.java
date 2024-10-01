package classexamples;

import java.util.Scanner;

public class M6Methods {

	// A method with no parameters, no return
	public static void printBanner() {
		System.out.println();
		System.out.println("==========================================");
		System.out.println();
	}

	// A method with one parameter that returns an integer value
	// Note there is no print statement here - that's left to the client!
	public static int addUpTo(int num) {
		int sum=1;
		
		// add the numbers up to num
		for(int ii=1;ii<=num;ii++) {
			sum += ii;
		}
		
		return sum;
	}
	
	// This method print the result of calling another method
	public static void printSumTo(int num) {
		System.out.println("The sum of the numbers from 1 through " + 
		                        num + " is " + addUpTo(num));
	}
	
	// Method with two parameters
	public static void printNTimes(String str, int count) {
		for (int ii=0;ii<count;ii++) {
			System.out.println(str);
		}
	}
	
	// This method open a Scanner inside its body (don't forget to close!)
	public static void promptToMultiPrint() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String input = scan.nextLine();
		
		System.out.println("How many times should I print? ");
		int num = scan.nextInt();
		
		printNTimes(input, num);
		
		scan.close();   // always close your resources
	}
	
	public static void main(String[] args) {

		printBanner();
		
		printSumTo(10);
		printSumTo(15);
		printSumTo(100);
		
		printBanner();

		printNTimes("This is a string", 3);
		
		printBanner();

		promptToMultiPrint();
		
		printBanner();
	}

}
