package videoexamples.twodimarrays;

public class TwoDimensionalArrays {
	
	public static void main(String[] args) {
		// Declare a 2D Array
		int[][] values = new int[4][5];
		
		// Fill a 2D array
		for(int rr=0;rr<4;rr++) {
			for(int cc=0;cc<5;cc++) {
				values[rr][cc] = (rr*10) + cc;
			}
		}

		// Print a 2D array
		for(int rr=0;rr<4;rr++) {
			for(int cc=0;cc<5;cc++) {
				System.out.print(values[rr][cc] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
