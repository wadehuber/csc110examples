package classexamples.module09arrays;

import java.util.Random;

public class M9ArrayExamples {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// Declaring arrays
		int[] nums = new int[10];
		double[] prices = new double[5];
		
		// Filling an array using a for loop
		for(int ii=0;ii<nums.length;ii++) {
			nums[ii] = (ii + 1) * 2;
		}
		
		// Print an array using a for loop
		System.out.print("nums: ");
		for(int ii=0;ii<nums.length;ii++) {
			// System.out.printf("| %d ", (ii+1) * 2);
			System.out.printf("| %d ", nums[ii]);
		}

		System.out.println("|");
		
		// Print 2 random sequences of doubles
		System.out.print("random: ");
		for(int ii=0;ii<prices.length;ii++) {
			System.out.printf("| %.2f ", rand.nextDouble() * 100);
		}
		System.out.println();
		System.out.print("random: ");
		for(int ii=0;ii<prices.length;ii++) {
			System.out.printf("| %.2f ", rand.nextDouble() * 100);
		}
		System.out.println();

		// Fill & print an array in the same loop
		System.out.print("prices: ");
		for(int ii=0;ii<prices.length;ii++) {
			prices[ii] = rand.nextDouble() * 100;
			System.out.printf("| %.2f ", prices[ii]);
		}
		System.out.println();

		// When we print the array of random doubles, the values are the same
		System.out.print("prices: ");
		for(int ii=0;ii<prices.length;ii++) {
			System.out.printf("| %.2f ", prices[ii]);
		}
		
		// Initialize an array with values
		int[] values =  {912, -438, 157, -764, 305, -221, 689, -990, 472, -56};
		// values = {1, 2, 3};  // Can only initialize during declaration
		char[] letterGrades = {'A', 'B', 'C', 'D', 'F', 'Z'};
		String[] names = {
					"Mason", "Elara", "Bryce", "Kiera",
					"Soren", "Lila", "Dante", "Nina"
				};
		
		System.out.println("Printing an array directly:");
		System.out.println("    nums: " + nums);
		System.out.println("  values: " + values);
		System.out.println("  grades: " + letterGrades);
		System.out.println("   names: " + names);
		
		// Print an array with a loop
		System.out.print("Names: " ); 
		for(int ii=0;ii<names.length; ii++) {
			System.out.print(" " + names[ii]);
		}
		System.out.println();
		
		// Print an array with a for-each loop
		System.out.print("Grades: " );
		for(char c : letterGrades) {
			System.out.print(" " + c);
		}
			
		System.out.println();
		System.out.println("Average values: ");
		System.out.printf("  values: %.2f\n", calculateAverage(values));
		System.out.printf("  nums: %.2f\n", calculateAverage(nums));
		
		printGradebook(names, letterGrades);
		
	}
	
	public static double calculateAverage(int[] values) {
		
		int sum = 0;
		double count = values.length;

		for (int num : values) {
			sum += num;
		}
		return sum / count;
	}
	
	public static void printGradebook(String[] students, char[] grades) {
		Random rand = new Random();
		// Gradebook associating two arrays of different sizes
		for(int ii=0; ii< students.length;ii++) {
			// Option 1: map indexes using modulo
			int gradeIndex = ii % grades.length;
			// Option 2: randomly choose cells in the smaller array
			gradeIndex = rand.nextInt(grades.length);
			System.out.println("  " + ii + ": " + students[ii] + 
					             "'s grade is " + grades[gradeIndex]);
		}
		
	}
		
}
