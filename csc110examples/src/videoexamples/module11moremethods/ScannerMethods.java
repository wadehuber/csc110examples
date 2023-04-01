package videoexamples.module11moremethods;

import java.util.Scanner;

public class ScannerMethods {
	
	public static void printBetween(Scanner scnr) {
		int start, end;
		
		System.out.println("Enter the start: ");
		start = scnr.nextInt();
		System.out.println("Enter the end: ");
		end = scnr.nextInt();
		
		printBetween(start, end);
	}
	
	public static void printBetween(int start, int end) {
		
		for (int ii=start; ii<= end; ii++) {
			System.out.print(ii + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x, y;
		
		System.out.println("First attempt:");
		printBetween(scnr);

		System.out.println("Second attempt:");
		System.out.println("Enter the second start: ");
		x = scnr.nextInt();
		System.out.println("Enter the second end: ");
		y = scnr.nextInt();
		printBetween(x, y);
		
		for(int ii=0;ii<15;ii++) {
			printBetween(10*ii, 10*ii+10);
		}

	}

}
