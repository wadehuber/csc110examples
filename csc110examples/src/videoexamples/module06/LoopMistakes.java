package videoexamples.module06;

import java.util.Random;

public class LoopMistakes {

	public static void main(String[] args) {
	
		// Updating the loop variable in the for loop body
		int n = 8;
		int total = 0;
		for(int ii=1;ii<=n;ii++) {
			ii = ii + 1;
			total = total + ii;
		}
		System.out.println("The total is " + total);

		// 
		
		
		// initialExpression not related to counting iterations
		//  move r = rand() before loop
		Random rand = new Random(); 
		for (int ii = 0, r = rand.nextInt(); ii < 5; ++ii) {
		   // Loop body 
		}

		// updateExpression not related to counting iterations
		// move r = r + 2 into loop body
		int r=0;
		for (int ii = 0; ii < 5; ++ii, r = r + 2) {
		   
		}

	}

}
