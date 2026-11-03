package classexamples.module09arrays;

import java.util.Random;

public class M9ArrayExamples {

	public static void main(String[] args) {
		Random rand = new Random();

		// Declaring arrays
		int[] scores = { 80, 90, 70 };
		int[] nums = new int[10];
		double[] prices = new double[5];

		System.out.println("scores[0] = " + scores[0]);
		System.out.println("scores[2] = " + scores[2]);

		System.out.println("Using a for loop:");
		System.out.print("\tscores: ");
		for (int ii = 0; ii < scores.length; ii++) {
			System.out.print(scores[ii] + " ");
		}
		System.out.println();

		int curvedGrade = scores[2] + 5;
		System.out.println("Curved grade: " + curvedGrade);

		// Print array with a for loop
		System.out.print("nums: ");
		for (int ii = 0; ii < nums.length; ii++) {
			System.out.print(nums[ii] + " ");
		}
		System.out.println();

		// Fill an array using a for loop
		for (int ii = 0; ii < nums.length; ii++) {
			nums[ii] = (ii + 1) * 2;
		}

		System.out.print("nums: ");
		for (int ii = 0; ii < nums.length; ii++) {
			System.out.print(nums[ii] + " ");
		}
		System.out.println();

		// Print 2 random sequences of doubles
		System.out.println();
		System.out.print("random 1: ");
		for (int ii = 0; ii < prices.length; ii++) {
			System.out.printf("| %.2f ", rand.nextDouble() * 100);
		}
		System.out.println();
		System.out.print("random 2: ");
		for (int ii = 0; ii < prices.length; ii++) {
			System.out.printf("| %.2f ", rand.nextDouble() * 100);
		}
		System.out.println();

		System.out.print("prices 1: ");
		for (int ii = 0; ii < prices.length; ii++) {
			prices[ii] = rand.nextDouble() * 100;
			System.out.printf("| %.2f ", prices[ii]);
		}
		System.out.println();

		// When we print the array of random doubles, the values are the same
		System.out.print("prices 2: ");
		for (int ii = 0; ii < prices.length; ii++) {
			System.out.printf("| %.2f ", prices[ii]);
		}
		System.out.println();

		int[] values = { 912, -438, 157, -764, 305, -221, 689, -990, 472, -56 };
		// values = {1, 2, 3, 4}; // Can only initialize during declaration
		char[] letterGrades = { 'A', 'B', 'C', 'D', 'F', 'Z' };
		String[] names = { "Mason", "Elara", "Bryce", "Kiera", "Soren", "Lila", "Dante", "Nina" };

		System.out.println();
		System.out.println("Printing an array directly:");
		System.out.println("    nums : " + nums);
		System.out.println("  values : " + values);
		System.out.println("  grades : " + letterGrades);
		System.out.println("   names : " + names);
		System.out.println();

		// Print an array with a loop
		System.out.println("Names: ");
		for (int ii = 0; ii < names.length; ii++) {
			System.out.print(" " + names[ii]);
		}
		System.out.println();

		// Print an array with a for-each loop
		System.out.println("Grades: ");
		for (char c : letterGrades) {
			System.out.print(" " + c);
		}
		System.out.println();

		System.out.println();
		System.out.println("Average values: ");
		System.out.printf("  values: %.2f\n", calculateAverage(values));
		System.out.printf("    nums: %.2f\n", calculateAverage(nums));
		System.out.println();

		// Randomly assign a weapon type to each character.
		// The same weapon type may be assigned multiple times.
		String[] characters = { "Warrior", "Wizard", "Rogue", "Paladin", "Archer" };
		String[] weapons = { "Sword", "Bow", "Staff" };

		for (int i = 0; i < characters.length; i++) {
			// Select a random valid index into the weapons array
			int weaponIndex = rand.nextInt(weapons.length);

			System.out.println(characters[i] + " gets a " + weapons[weaponIndex]);
		}

		System.out.println();
		// Assign students to shifts by cycling through the shifts array.
		String[] students = { "Alice", "Bob", "Charlie", "Diana", "Ethan", "Frank", "Grace" };
		String[] shifts = { "Morning", "Afternoon", "Evening" };

		// Iterate through students. Assign a shift based on the current index
		for (int i = 0; i < students.length; i++) {
			// Modulo wraps the shift index back to 0 when needed
			int shiftIndex = i % shifts.length;

			System.out.println(students[i] + " works the " + shifts[shiftIndex] + " shift.");
		}

	}

	public static double calculateAverage(int[] values) {
		int sum = 0;
		double count = values.length;

		for (int num : values) {
			sum += num;
		}

		return sum / count;
	}

}
