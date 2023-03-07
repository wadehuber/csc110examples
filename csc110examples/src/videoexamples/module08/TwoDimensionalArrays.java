package videoexamples.module08;

public class TwoDimensionalArrays {
	
	

	public static void main(String[] args) {
		// Declare a 2D array
		
		int[][] scores0 = new int[4][5];
		
		
		int[][] scores = { {89, 73, 83, 94, 95},
				            {98, 100, 94, 92, 100}, 
				            {88, 94, 88, 79, 81}, 
				            {100, 89, 91, 98, 94} };
		
		for(int rr=0;rr<4;rr++) {
			for(int cc=0;cc<5;cc++) {
				System.out.print(" " + scores[rr][cc]);
			}
			System.out.println();
		}
		
		for(int rr=0;rr<4;rr++) {
			System.out.println("Player " + rr + " scores:" + scores[rr]);
		}
		
		int value;
		value = scores[3][2];
		System.out.println("value[3][2] = " + value);

		value = scores[0][0];
		System.out.println("scores[0][0] = " + value);
		value = scores[3][4];
		System.out.println("scores[3][4] = " + value);
		value = scores[1][3];
		System.out.println("scores[1][3] = " + value);
		value = scores[2][1];
		System.out.println("scores[2][1] = " + value);
		value = scores[2][2];
		System.out.println("scores[2][2] = " + value);
		value = scores[2][4];
		System.out.println("scores[2][4] = " + value);
	}

}
