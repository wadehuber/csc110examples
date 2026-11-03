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
		
		// Declare a 2D integer array with 7 rows and 15 columns
		int[][] vals = new int[7][15];
		
		// Print the array
		System.out.println("nums array:");
		for (int row=0; row < nums.length; row++) {
			for (int col=0; col < nums[row].length; col++) {
				System.out.printf("%4d", nums[row][col]);
			}
			System.out.println();
		}
		System.out.println();
		
		// Fill the 7x15 array
		for (int row=0; row<vals.length; row++) {
			for (int col=0; col<vals[row].length; col++) {
				vals[row][col] = rand.nextInt(100);
			}
		}
		System.out.println("vals array: ");
		printArray(vals);
		System.out.println();
	
		// Ragged array
		int[][] raggedArray = {
				{1, 11, 111},
				{0, 1, 2, 3, 4, 5, 6, 7},
				{8, 9},
				{2, 4, 6, 8, 10},
				{-4, -3, -2, -1}
		};
		
		System.out.println("Ragged array:");
		printArray(raggedArray);
		
		raggedArray[1][2] = 999;
		int[] aaa = {9, 7, 5, 3, 1, 0, -1, -3, -5, -7};
		raggedArray[3] = aaa;
		
		System.out.println("Ragged array after changes:");
		printArray(raggedArray);
		
	}
	
	public static void printArray(int[][] arr) {
		for (int row=0; row < arr.length; row++) {
			for (int col=0; col < arr[row].length; col++) {
				System.out.printf("%5d", arr[row][col]);
			}
			System.out.println();
		}

	}

}
