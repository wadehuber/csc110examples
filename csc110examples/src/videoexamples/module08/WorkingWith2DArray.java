package videoexamples.module08;

import java.util.Arrays;

public class WorkingWith2DArray {

	public static void main(String[] args) {
		// Initialize a 2D array
		int[][] scores = { {89,  73, 83, 94,  95},
				           {98, 100, 94, 92, 100},
				           {88,  94, 88, 79,  81},
				           {100, 89, 91, 98,  94}
		                 };
		
		// Printing a 2D array
		for (int rr=0; rr < 4; rr++) {
			for (int cc=0; cc < 4; cc++) {
				System.out.print(" " + scores[rr][cc]);
			}
			System.out.println();
		}
		System.out.println();

		// Print a 2D array one row at a time
		for (int rr=0; rr < 4; rr++) {
			System.out.println("Player " + rr + " scores: " + Arrays.toString(scores[rr]));
		}
		
		// Look at individual element in the 2D array
		int value = scores[3][2];
		System.out.println("value = " + value + " (scores[3][2])");
		System.out.println("scores[0][0] = " + scores[0][0]);
		System.out.println("scores[1][3] = " + scores[1][3]);
		System.out.println("scores[2][0] = " + scores[2][0]);
		System.out.println("scores[2][1] = " + scores[2][1]);
		System.out.println("scores[2][4] = " + scores[2][4]);
		System.out.println("scores[3][4] = " + scores[3][4]);
		
	}

}
