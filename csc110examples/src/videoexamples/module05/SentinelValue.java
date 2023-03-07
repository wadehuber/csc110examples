package videoexamples.module05;

import java.util.Scanner;

public class SentinelValue {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int value = -1;
		int total = 0;
		int count = 0;
		
		System.out.print("Enter a positive number (0 to quit): ");
		value = scnr.nextInt();
		while (value != 0) {
			total += value;
			System.out.println("  The total so far is " + total);
			System.out.print("Enter a positive number (0 to quit): ");
			value = scnr.nextInt();
		}
		System.out.println("The total is " + total);
		
		total = 0;
		do {
			System.out.print("Enter test score (-1 to quit): ");
			value = scnr.nextInt();
			if (value >= 0) {
				total += value;
				count ++;
			}
		} while (value >= 0) ;
		
		System.out.print("The average of " + count + " tests ");
		System.out.println("is " + total/count);
			
}

}
