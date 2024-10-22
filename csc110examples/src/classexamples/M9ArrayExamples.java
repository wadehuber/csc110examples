package classexamples;

import java.util.Random;

public class M9ArrayExamples {

	public static void main(String[] args) {
		Random rand = new Random();

		double[] prices = new double[5];
		int[] nums = new int[10];
		char[] letterGrades = {'A', 'B', 'C', 'D', 'F'};
		String[] names = {"Lucas", "Chana", "Tucker", "Jaydan", "Halle", "Angel"};
				
		
		for (int ii=0;ii<prices.length;ii++) {
			prices[ii] = Math.random() * 100;
		}
		
		for (int ii=0;ii<prices.length;ii++) {
			System.out.printf("%.2f ", prices[ii]);
		}
		System.out.println("\n");
		
		for (int ii=0;ii<nums.length;ii++) {
			nums[ii] = rand.nextInt(100) + 1;
		}

		for (int num : nums) {
			System.out.print(num + " ");
		}
		
		System.out.println("\n");
		for (int ii=0;ii<names.length;ii++) {
			int gradeIndex = rand.nextInt(letterGrades.length);
			System.out.println(names[ii] + "'s grade is " + letterGrades[gradeIndex]);
		}
		


	}

}
