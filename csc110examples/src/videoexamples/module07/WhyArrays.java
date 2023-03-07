package videoexamples.module07;

public class WhyArrays {

	public static void main(String[] args) {
		
		// Golf scores
		int round1 = 83;
		int round2 = 78;
		int round3 = 92;
		int round4 = 85;
		
		System.out.println("Round 1: " + round1);
		System.out.println("Round 2: " + round2);
		System.out.println("Round 3: " + round3);
		System.out.println("Round 4: " + round4);
		
		int[] scores = new int[4];
		scores[0] = 83;
		scores[1] = 78;
		scores[2] = 92;
		scores[3] = 85;
		
		for (int round=0;round<scores.length;round++) {
			System.out.println("Round " + round + " score:" + scores[round]);
		}
		
		int[] scores2 = {83, 78, 92, 85};
		for (int round=0;round<scores.length;round++) {
			System.out.println("Round " + round + " score:" + scores[round]);
		}

	}

}
