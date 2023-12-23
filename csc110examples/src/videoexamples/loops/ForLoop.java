package videoexamples.loops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		int num1, num2, num3, num4, num5;
		int total;
		
		System.out.print("Enter number 1: ");
		num1 = scnr.nextInt();
		System.out.print("Enter number 2: ");
		num2 = scnr.nextInt();
		System.out.print("Enter number 3: ");
		num3 = scnr.nextInt();
		System.out.print("Enter number 4: ");
		num4 = scnr.nextInt();
		System.out.print("Enter number 5: ");
		num5 = scnr.nextInt();
	
		total = num1 + num2 + num3 + num4 + num5;
		System.out.println("The total is " + total);
		
		scnr.close();
		
	}

}
