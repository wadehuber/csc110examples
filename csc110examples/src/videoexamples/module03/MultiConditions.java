package videoexamples.module03;

import java.util.Scanner;

public class MultiConditions {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int cholesterolLevel = scnr.nextInt();
		String level = "";
		
		if (cholesterolLevel < 200) {
			level = "normal";
		}
		else if (cholesterolLevel < 240) {
			level = "borderline";
		}
		else {
			level = "high";
		}

		System.out.println("Your cholesterol level is " + level);
	
		scnr.close();
	}

}
