package videoexamples.loops;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int rows;
		int cols;
		int w = 7;
		int l = 3;
		int h = 5;
		
		System.out.println("l="+l + ", w="+w);
		for(int x = 1; x <= l; x++) {
			for(int y = 1; y <= w; y++) {  
				System.out.print("*");
			}
			System.out.println( );
		}
		System.out.println();
		System.out.println("h="+h);
		for(int ii = 1; ii <= h; ii++) {
			for(int jj = 1; jj <= ii; jj++) {  
				System.out.print("*");
			}
			System.out.println( );
		}
	
		System.out.println("Times table generator");
		System.out.print("How many rows would you like? " );
		rows = scnr.nextInt();
		System.out.print("How many columns would you like? " );
		cols = scnr.nextInt();
		for (int rr=1;rr<=rows;rr++) {
			System.out.print(rr + ": ");
			for (int cc=1;cc<=cols;cc++) {
				System.out.print((rr * cc) + " ");
			}
			System.out.println();
		}
		
		int times = 0;
		do {
			System.out.print("Enter a number (0 to quit): ");
			times = scnr.nextInt();
			for (int ii=0;ii<times;ii++) {
				System.out.print(ii + " ");
			}
			System.out.println();
		} while (times > 0);
		

	}

}
