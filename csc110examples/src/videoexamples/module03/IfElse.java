package videoexamples.module03;

import java.util.Random;

public class IfElse {

	private static final int MAX_VALUE = 20;

	public static void main(String[] args) {
		Random randNum = new Random();
		int guess;
		int count = 0;

		for (int ii=0;ii<1000;ii++) {
		    guess = randNum.nextInt(MAX_VALUE) + 1;
			if (guess == 10) {
				count ++;
			}
		}
		System.out.println("The number 10 was guessed " + count + " times");

	}

}
