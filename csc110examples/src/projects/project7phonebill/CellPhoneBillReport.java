package projects.project7phonebill;


//Program Name : CellPhoneBillReport
//Author: Patricia Baker and ??
//Date:
//Description: Students complete this code skeleton.
//

import java.text.NumberFormat;
import java.util.Scanner;

public class CellPhoneBillReport {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		String name= "";
		String year = "";
		//Monthly cell phone bills in dollars
		double[] cellPhoneBill = {45.24, 54.67, 43.66, 55.32, 67.19, 44.61, 
				                  65.29, 49.75, 43.21, 44.67, 56.99, 64.34};
		//corresponding months
		String[] month =         {"JAN", "FEB", "MAR", "APR", "MAY", "JUN",
				                  "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
		double highestBill = 0;
		double lowestBill = 0;
		double totalBill = 0;
		int countHigh = 0;
		double highMark = 50.00;
		
		
		System.out.println("Welcome Valued Customer");
		//Enter your name and year
		//<YOUR CODE GOES HERE>
		
		
		//find the highest  bill
		//<YOUR CODE GOES HERE>
		
		
		//find the lowest  bill
		//<YOUR CODE GOES HERE>
	
		
		//find the number of monthly bills above the highMark 
		//<YOUR CODE GOES HERE>
		
		
		//determine annual total bill
		//<YOUR CODE GOES HERE>
		
		
		//display report title and dashes (adjusts based on name)
		System.out.println("\nAnnual Cell Phone Report for " + name);
		for(int x = 0; x < name.length() + 29; x++) 
			System.out.print("-"); 
		
		System.out.println();
		
		//display month and corresponding  bill amounts 
		//<YOUR CODE GOES HERE>
		
		//display results - see example in assignment
		//<YOUR CODE GOES HERE>
		
		
		//display dashes
		for(int x = 0; x < name.length() + 29; x++) 
			System.out.print("-"); 
		
		System.out.println();
		
		scnr.close();

	}

}
