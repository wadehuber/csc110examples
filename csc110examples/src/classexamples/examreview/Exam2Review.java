package classexamples.examreview;

import java.util.Random;

public class Exam2Review {

	public static void printTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int ii=0; ii<row; ii++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printRightTriangle(int n) {
		for(int row=1;row<=n;row++) {
			for(int ii=1; ii<=n; ii++) {
				if (ii > (n-row)) {
					System.out.print("+");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void arrayExample(int rows, int cols) {
		// Declare an array
		int[][] arr = new int[rows][cols];
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				arr[row][col] = (row + 1) * 100 + col + 1;
			}
		}

		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				System.out.print(" " + arr[row][col]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		for(int ii=0;ii<=5;ii++) {
			System.out.println("Triangle " + ii);
			printTriangle(ii);
			System.out.println();
		}

		for(int ii=0;ii<=5;ii++) {
			System.out.println("RightTriangle " + ii);
			printRightTriangle(ii);
			System.out.println();
		}
		
		for(int ii=3;ii<=5;ii++) {
			System.out.println("arrayExample " + ii + ", 7");
			arrayExample(ii, 7);
			System.out.println();
		}

		// Fill an array, but and random fill with 0
		System.out.println("\nAnother array example:");
		int[][] arr = new int[6][10];
		Random rand = new Random();
		for(int row=0;row<6;row++) {
			for(int col=0;col<10;col++) {
				// if ((row + col) % 7 == 0) {
				if (rand.nextInt(10) < 3) {
					arr[row][col] = 0;
				} else {
					arr[row][col] = (row*10) +col;
				}
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();
		}
	}

}
