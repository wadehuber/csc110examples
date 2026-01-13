package classexamples;

import java.util.Scanner;

public class Methods {
	
	// Print a separator
	public static void printSeparator() {
		System.out.println();
		System.out.println("==========================================");
		System.out.println();
	}

	// Calculate the sum of the numbers 1 up to x
	public static int addUpTo(int num) {
		int sum = 0;
		
		for (int ii=1;ii<=num;ii++) {
			sum += ii;
		}
		
		return sum;
	}
	
	// Method that calls another method
	public static void printSumTo(int num) {
		System.out.println("The sum up to " + num 
				+ " is " + addUpTo(num));
	}
	
	// Overloaded method - different signatures
	public static void printNTimes(String str) {
		printNTimes(str, 10);
	}

	public static void printNTimes(String str, int n) {
		for(int ii=0;ii<n;ii++) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	// Open a Scanner inside a method (don't forget to close!)
	public static void promptToMultiPrint() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		
		System.out.print("How many times should I print? ");
		int num = scan.nextInt();
	
		printNTimes(input, num);
		
		scan.close();
		
	}
	
	public static int addTogether(int x, int y) {
		System.out.printf("Adding: x=%d, y=%d\n",x,y);
		x = x + y;  // Calculate the sum
		System.out.printf("SUM: x=%d\n",x);
		return x;
	}

	public static void main(String[] args) {
		
		printSeparator();

		System.out.println("Methods in Java");
		
		printSeparator();
		
		System.out.println("addUpTo Testing");
		printSumTo(1);
		printSumTo(5);
		printSumTo(10);
		printSumTo(20);
		printSumTo(100);
		
		printSeparator();
		
		System.out.println("printNTimes Testing");
		printNTimes("Hello");
		printNTimes("Java");
		printNTimes("Hello",8);
		printNTimes("Java",8);

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
		a = addTogether(x, a);
		System.out.printf("After a=x+a: x=%d, y=%d, a=%d, b=%d\n", x, y, a, b);

		
		
		printSeparator();
		
	}

}
