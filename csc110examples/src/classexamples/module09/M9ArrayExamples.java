package classexamples.module09;

import java.util.Random;

public class M9ArrayExamples {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// Declaring arrays
		int[] nums = new int[10];
		double [] prices = new double[5];
		
		// Filling an array with a loop
		for(int ii=0;ii<nums.length;ii++) {
			nums[ii] = (ii+1) * 2;
		}
		
		// Print an array with a loop
		System.out.println("nums: ");
		for(int ii=0;ii<nums.length;ii++) {
			System.out.print("| " + nums[ii] + " ");
		}
		System.out.println("|");

		// Fill & print an array in the same loop
		System.out.println("prices: ");
		for(int ii=0;ii<prices.length;ii++) {
			prices[ii] = rand.nextDouble() * 100;
			System.out.print("| " + prices[ii] + " ");
		}
		System.out.println("|");

		// Initializing declarations
		int[] values =  {-847, 295, -613, 742, -159, 386, -925, 510, -273, 648};
		char[] letterGrades = {'A', 'B', 'C', 'D', 'F', 'Y'};
		String[] names = {"Lucas", "Chana", "Tucker", "Jaydan", "Halle", "Angel", "Jack", "Jane"};
		
		System.out.println("Printing an array directly:");
		System.out.println("  nums: " + nums);
		System.out.println("  names: " + names);
		System.out.println("\n");
		
		// Print an array with a loop
		System.out.print("Names: ");
		for(int ii=0; ii<names.length; ii++) {
			System.out.print("  " + names[ii]);
		}

		System.out.println("");
		// Print an array with a for-each
		System.out.print("Grades: ");
		for(char letter : letterGrades) {
			System.out.print("  " + letter);
		}
		System.out.println("\n");

		printGradebook(names, letterGrades);

		}
		
	public static void printGradebook(String[] students, char[] grades) {
		Random rand = new Random();

		// Gradebook - associating two arrays of different sizes
		for(int ii=0; ii<students.length;ii++) {
			// Option 1: map indexes using modulo
			int gradeIndex = ii % grades.length;
			// Option 2: randomly choose cells in the smaller array
			gradeIndex = rand.nextInt(grades.length);
			System.out.println("  " + students[ii] + "'s grade is " + 
		                                      grades[gradeIndex]);
		}
	}
	
}
