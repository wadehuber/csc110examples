package videoexamples.module02;

import java.text.DecimalFormat;

public class FormattingDoubles {

	public static void main(String[] args) {
		
		DecimalFormat fmt1 = new DecimalFormat("#");
		DecimalFormat fmt2 = new DecimalFormat("#.##");
		DecimalFormat fmt3 = new DecimalFormat("#,###.##");

		double number1 = 12.3456789;
		double number2 = 98.7654321;
		double number3 = 1234567890.555;
		double number4 = .0000000000000009;
		
		System.out.println("No formatting: ");
		System.out.println("  " + number1);
		System.out.println("  " + number2);
		System.out.println("  " + number3);
		System.out.println("  " + number4);
		
		System.out.println();
		System.out.println("fmt1 # - no decimal places: ");
		System.out.println("  " + fmt1.format(number1));
		System.out.println("  " + fmt1.format(number2));
		System.out.println("  " + fmt1.format(number3));
		System.out.println("  " + fmt1.format(number4));
		
		System.out.println();
		System.out.println("fmt2 #.## - 2 decimal places: ");
		System.out.println("  " + fmt2.format(number1));
		System.out.println("  " + fmt2.format(number2));
		System.out.println("  " + fmt2.format(number3));
		System.out.println("  " + fmt2.format(number4));
		
		System.out.println();
		System.out.println("fmt3 #,###.## - Comma-separated, 2 decimal places: ");
		System.out.println("  " + fmt3.format(number1));
		System.out.println("  " + fmt3.format(number2));
		System.out.println("  " + fmt3.format(number3));
		System.out.println("  " + fmt3.format(number4));
		
		

	}

}
