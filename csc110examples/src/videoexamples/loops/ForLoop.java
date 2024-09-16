package videoexamples.loops;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		int num;
		int total = 0;
		
		for(int ii=0; ii<5; ii++) {
			System.out.print("Enter number : ");
			num = scnr.nextInt();
			total = total + num;
		}
	
		System.out.println("The total is " + total);
		
		scnr.close();
		
	}

}
