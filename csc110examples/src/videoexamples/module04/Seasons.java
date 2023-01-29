package videoexamples.module04;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int month;
	
		System.out.println("Enter 1-12: ");
		month = scnr.nextInt();
		
		switch(month) {
			case 1:
			case 2:
			case 3:
				System.out.println("Winter");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("Spring");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("Summer");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("Winter");
				break;
			default:
				System.out.println("Invalid Value");
		}

		scnr.close();
	}

}
