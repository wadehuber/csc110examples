package videoexamples.arrays;

import java.text.NumberFormat;

public class NumberFormatting {

	final static double INCOME_TAX_RATE = 0.20;  // 20% income tax

	public static void main(String[] args) {

		NumberFormat percentFmt = NumberFormat.getPercentInstance();
		NumberFormat moneyFmt = NumberFormat.getCurrencyInstance();

		int salary = 75000;
		
		double weeklyWage = salary / 52;
		double taxes = weeklyWage * INCOME_TAX_RATE;
		
		// Print weekly pay for salaried employee
		
		// Without NumberFormat
	    //System.out.println("Yearly salary: " + salary);
	    //System.out.println("Weekly pay: " + weeklyWage);
	    //System.out.println("Taxes: " + taxes + " at " + INCOME_TAX_RATE);
	    
	    // With NumberFormat
	    System.out.println("Yearly salary: " + moneyFmt.format(salary));
	    System.out.println("Weekly pay: " + moneyFmt.format(weeklyWage));
	    System.out.println("Taxes: " + moneyFmt.format(taxes) + " at "
	                         + percentFmt.format(INCOME_TAX_RATE));

	}
}
