package videoexamples.module02;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		String sentence;
		
		System.out.println("Enter a number: ");
		num = scnr.nextInt();
		scnr.nextLine();
		
		System.out.println("Enter a sentence: ");
		sentence = scnr.nextLine();
		
		System.out.println("Number = " + num);
		System.out.println("Sentence = " + sentence);
		
		scnr.close();
	}

}
