package videoexamples.arrays;

public class WhyArrays {

	public static void main(String[] args) {
		
		// Golf scores
		int round1 = 83;
		int round2 = 78;
		int round3 = 92;
		int round4 = 85;
		
		System.out.println("Scores saved in 4 variables:");
		System.out.println("Round 1: " + round1);
		System.out.println("Round 2: " + round2);
		System.out.println("Round 3: " + round3);
		System.out.println("Round 4: " + round4);
		System.out.println();
		
		// Array
		int[] scores = new int[4];
		scores[0] = 83;
		scores[1] = 78;
		scores[2] = 92;
		scores[3] = 85;
		
		System.out.println("Scores saved in an array:");
		for (int round=0;round<scores.length;round++) {
			System.out.println("Round " + (round+1) + " score: " + scores[round]);
		}
		System.out.println();
		
		// Initialize an array
		int[] scores2 = {83, 78, 92, 85};

		System.out.println("Scores saved in an initialized array:");
		for (int round=0;round<scores2.length;round++) {
			System.out.println("Round " + (round+1) + " score: " + scores2[round]);
		}
		System.out.println();
		
	}

}
