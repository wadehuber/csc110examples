package videoexamples.module02;

import java.util.Scanner;

public class MoreScanner {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String str = scnr.next();
		scnr.nextLine();
		System.out.println("str = " + str);
		
		System.out.println("Enter a number: ");
		int num = scnr.nextInt();
		scnr.nextLine();
		System.out.println("num = " + num);
		
		System.out.println("Enter a decimal: ");
		double decimal = scnr.nextDouble();
		System.out.println("decimal = " + decimal);
		scnr.nextLine();
		
		System.out.println("Enter a sentence: ");
		String sentence = scnr.nextLine();
		System.out.println("sentence = " + sentence);
		
		scnr.close();
	}

}
