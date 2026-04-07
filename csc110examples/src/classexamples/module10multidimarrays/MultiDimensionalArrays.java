package classexamples.module10multidimarrays;

import java.util.Random;

public class MultiDimensionalArrays {
	
	public static void main(String args[]) {
		Random rand = new Random();
		
		// Declare & initialize a 2D integer array 4 rows, 3 columns
		int [][] nums = { {0,  1,  2}, 
				          {3,  4,  5}, 
				          {6,  7,  8},
				          {9, 10, 11} };
		
		// Print the array
		System.out.println("nums array: ");
		for (int row=0; row < nums.length; row++) {
			for (int col = 0; col < nums[row].length; col++) {
				System.out.printf("%4d", nums[row][col]);
			}
			System.out.println();
		}
		
		// Declare a 2D integer array with 7 rows and 15 columns.
		int[][] vals = new int[7][15];
		
		// Fill the array
		for(int row=0; row < vals.length; row++) {
			for (int col=0; col < vals[row].length; col++) {
				vals[row][col] = rand.nextInt(100);
			}
		}
		
		System.out.println();
		System.out.println("vals array:");
		printArray(vals);
		
		// Ragged array
		// int[][] raggedArray1 = new int [5][];
		
		int[][] raggedArray1 = { {1, 11, 111, 123},
				                 {0, 1, 2, 3, 4, 5},
				                 {8, 9},
				                 {4, 8, 15, 16, 23, 42},
				                 {1, 1, 0} };
		
		System.out.println();
		System.out.println("Initial ragged array #1:");
		printArray(raggedArray1);
	
		raggedArray1[1][3] = 999;
		int[] aaa = {9, 7, 6, 5, 4, 3, 2, 1};
		raggedArray1[3] = aaa;
		System.out.println();

		System.out.println("Updated ragged array #1:");
		printArray(raggedArray1);
		
	}
	
	public static void printArray(int[][] arr) {
		for (int row=0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%4d", arr[row][col]);
			}
			System.out.println();
		}
	}

}
