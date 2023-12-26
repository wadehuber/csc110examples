package projects.exceptions;

import java.util.Scanner;

public class ExceptionsProject {

	public static void main(String[] args) {

		int numOfValues = 0;
		int size = 10;
		int[] dataArray = new int[size];
		Scanner scnr = new Scanner(System.in);
		String tryAgain = "N";
		
		System.out.println("CSC110 Exceptions Project");
		do {

			System.out.print("How many values do you want to load? ");
			numOfValues = scnr.nextInt();
			
			resetArray(dataArray);
				
			// fill the array with 0, 10, 20,30, 40, 50, 60....
			for(int index = 0; index < numOfValues; index++)
			{
				// COMPLETE AS PART OF PROJECT
			}
				
			System.out.println("Array");
			System.out.println("-------");
				
			displayArray(dataArray)	;
			System.out.println("The average is: " + calculateIntAverage(dataArray, numOfValues));
					
			System.out.println();
			System.out.print("Try again? Y or N: ");
			tryAgain = scnr.next();

		} while (tryAgain.equalsIgnoreCase("Y"));
		
		scnr.close();	
		System.out.println();
		System.out.println("Thanks!");
		
	}
	
	// Display an array in the following format:
	//    [0]: 0
	//    [1]: 10
	//    [2]: 20
	//    ... continuing until all values are displayed
	public static void displayArray(int[] someArray) {
		// COMPLETE AS PART OF PROJECT
	}
	
	// Calculate the integer average: 
	//    both sum and num are int, average should be sum/num
	public static int calculateIntAverage(int[] someArray,int num) {

		// COMPLETE AS PART OF PROJECT
		
		return 0;
	}
	
	// load all elements of the array with 0
	public static void resetArray(int[] someArray) {
		
		// COMPLETE AS PART OF PROJECT
		
	}
}
