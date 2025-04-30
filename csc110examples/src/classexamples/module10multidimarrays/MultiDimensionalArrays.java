package classexamples.module10multidimarrays;

import java.util.Random;

public class MultiDimensionalArrays {
	
	public static void main(String args[]) {
		Random rand = new Random();
		
		// Declare & initialize 2D integer array 4 rows and 3 columns
		int[][] nums = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {9, 10, 11}};
	
		// Print the array
		System.out.println("nums array:");
		for (int row=0;row<nums.length;row++) {
			for (int col=0;col<nums[row].length;col++) {
				System.out.printf("%4d",nums[row][col]);
			}
			System.out.println();  // Go to the next line when done printing row
		}
		
		
		// Declare 2D integer array 7 rows and 15 columns
		int[][] vals = new int[7][15];
		
		// Initialize this array
		for (int row=0;row<vals.length;row++) {
			for (int col=0;col<vals[row].length;col++) {
				vals[row][col] = rand.nextInt(100);
			}
		}

		// Print the array
		System.out.println();
		System.out.println("vals:");
		printArray(vals);
		
		
		// Ragged array
		int[][] raggedArray1 = new int[5][];
		
		// Initialize ragged array
		int[] a0 = {1, 11, 111, 123};
		int[] a1 = {0, 1, 2, 3, 4, 5};
		int[] a2 = {8, 9};
		int[] a3 = {4, 8, 15, 16, 23, 42};
		int[] a4 = {1, 1, 0};
		
		raggedArray1[0] = a0;
		raggedArray1[1] = a1;
		raggedArray1[2] = a2;
		raggedArray1[3] = a3;
		raggedArray1[4] = a4;
		
		System.out.println("\nraggedArray1:");
		printArray(raggedArray1);
		
		int raggedArray2[][] = {
	            {1, 2, 3, 4},
	            {5, 6},
	            {7, 8, 9, 10, 11}
		};
		System.out.println("\nraggedArray2:");
		printArray(raggedArray2);
	}
		
	public static void printArray(int[][] arr) {
		for (int row=0;row<arr.length;row++) {
			for (int col=0;col<arr[row].length;col++) {
				System.out.printf("%4d",arr[row][col]);
			}
		System.out.println();
		}
	}

}
