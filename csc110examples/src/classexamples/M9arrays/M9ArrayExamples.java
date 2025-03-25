package classexamples.M9arrays;

import java.util.Random;

public class M9ArrayExamples {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// Declaring arrays
		int[] nums = new int[10];
		double[] prices = new double[5];
		
		// Initializing declarations
		int[] values =  {-847, 295, -613, 742, -159, 386, -925, 510, -273, 648};
		char[] letterGrades = {'A', 'B', 'C', 'D', 'F', 'Y'};
		String[] names = {"Lucas", "Chana", "Tucker", "Jaydan", "Halle", "Angel"};
		
		System.out.println(nums);
		System.out.println(names);
		
		// Print an array with a loop
		System.out.print("Names: ");
		for(int ii=0; ii<names.length; ii++) {
			System.out.print("  " + names[ii]);
		}
		System.out.println("\n");
		
		// Print an array with a for-each loop
		System.out.print("Grades: ");
		for(char letter : letterGrades) {
			System.out.print("  " + letter);
		}
		System.out.println("\n");
		
		// Fill an array with a loop, then print the values
		for(int ii=0; ii<prices.length;ii++) {
			prices[ii] = Math.random() * 100;
		}
		System.out.print("Prices: ");
		for(double price : prices) {
			System.out.printf("  $%.2f", price);
		}
		System.out.println("\n");
		
		// Fill & print in a single loop
		System.out.print("Numbers: ");
		for (int num : nums) {
			num = rand.nextInt(100) + 1;
			System.out.print("   " + num);
		}
		System.out.println("\n");
		
		// But be careful!!!
		int[] badNums = new int[10];
		System.out.print("Bad Numbers: ");
		for (int ii=0;ii<badNums.length;ii++) {
			int nextNum = rand.nextInt(100) + 1;
			badNums[0] = nextNum;                // BUG - should use index ii
			System.out.print("   " + nextNum);
		}
		System.out.println("\n");
		System.out.print("Bad Numbers (the truth): ");
		for (int ii=0;ii<badNums.length;ii++) {
			System.out.print("   " + badNums[ii]);
		}
		System.out.println("\n");
		
		// Gradebook - associating two arrays of different sizes
		System.out.println("Gradebook:");
		for (int ii=0;ii<names.length;ii++) {
			// Option 1 - the modulo operator
			int gradeIndex = ii % letterGrades.length;
			// Option 2 - randomly choose cells in the smaller array
			gradeIndex = rand.nextInt(letterGrades.length);
			System.out.println("  " + names[ii] + "'s grade is " + 
		                              letterGrades[gradeIndex]);
		}
		
		// 2 letter grade deductions
		System.out.println("\nDeducting letter grades:");
		int[] gIndexs = {0,2,3,5};
		for (int gIndex : gIndexs) {
			deductLetterGrade(gIndex, letterGrades);
		}
		
		// Print the values array
		System.out.print("\nValues: ");
		for (int value : values) {
			System.out.print("   " + value);
		}
		System.out.println("\n");
		
		fixNegatives(values);
		printArray("Values", values);
		

	}
	
	public static void printArray(String name, int[] arr) {
		System.out.print(name + ": ");
		for (int thing : arr) {
			System.out.print("   " + thing);
		}
		System.out.println("\n");
	}
	
	public static char deductLetterGrade(int gradeIndex, char grades[]) {
		int newIndex = Math.min(grades.length-1, gradeIndex+2);
		System.out.println("Original grade: " + grades[gradeIndex]);
		System.out.println("   Grade after deduction " + grades[newIndex]);
		return grades[newIndex];
	}
	
	public static void fixNegatives(int[] nums) {
		for (int ii=0; ii<nums.length; ii++) {
			if (nums[ii] < 0) {
				nums[ii] = nums[ii] * -1;
			}
		}
	}
}
