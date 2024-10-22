package classexamples;

import java.util.Random;

public class M9ArrayExamples {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// Declaring arrays
		int[] nums = new int[10];
		double[] prices = new double[5];
		
		char[] letterGrades = {'A', 'B', 'C', 'D', 'F'};
		String[] names = {"Lucas", "Chana", "Tucker", "Jaydan", "Halle", "Angel"};
		
		// Fill array with a loop
		for(int ii=0; ii<prices.length; ii++) {
			prices[ii] = Math.random() * 100;
		}
		// Print array with a loop
		System.out.println("Prices:");
		for(int ii=0; ii<prices.length; ii++) {
			System.out.printf("  $%.2f\n", prices[ii]);
		}
		
		// Initialize & print in same loop
		System.out.print("Nums: ");
		for(int ii=0;ii<nums.length; ii++) {
			nums[ii] = rand.nextInt(100) + 1;
			System.out.print(nums[ii] + " ");
		}
		System.out.println();
		
		// Gradebook - associating two arrays of different sizes
		System.out.println();
		System.out.println("Gradebook:");
		for (int ii=0; ii<names.length; ii++) {
			int gradeIndex=rand.nextInt(letterGrades.length);
			System.out.println("  " + names[ii] + "'s grade is " + letterGrades[gradeIndex]);
		}
		
		// 2 letter grade deduction
		int gIndex=0;
		deductLetterGrade(gIndex, letterGrades);
		gIndex=2;
		deductLetterGrade(gIndex, letterGrades);
		gIndex=3;
		deductLetterGrade(gIndex, letterGrades);
		
		// For-each loop
		System.out.println();
		System.out.print("Nums (for-each): ");
		for (int value : nums) {
			System.out.print("  " + value);
		}
		System.out.println();
	}
	
	public static void deductLetterGrade(int gradeIndex, char grades[]) {
		int newIndex=Math.min(gradeIndex+2, grades.length-1);
		System.out.print("Original grade: " + grades[gradeIndex]);
		System.out.println("    Grade after 2 letter grade deduction: " + grades[newIndex]);
	}

}
