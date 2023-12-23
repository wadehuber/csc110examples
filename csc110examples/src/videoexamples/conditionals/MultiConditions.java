package videoexamples.conditionals;

import java.util.Scanner;

public class MultiConditions {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your cholesterol level:" );
		int cholesterolLevel = scnr.nextInt();
		String result;
		
		if (cholesterolLevel > 240) {
			result = "unhealthy";
		}
		else if (cholesterolLevel >= 200) {
			result = "at-risk";
		}
		else {
			result = "healthy";
		}
		
		System.out.println("Your cholesterol level is " + result);
	
		scnr.close();
	}

}
