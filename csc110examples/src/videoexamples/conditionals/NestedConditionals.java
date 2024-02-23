package videoexamples.conditionals;

import java.util.Scanner;

public class NestedConditionals {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String language;
		// language = "Spanish";
		language = "French";
		// language = "English";

		System.out.println("Enter a number (1-3): ");
		int number = scnr.nextInt();

		if (language.toLowerCase().equals("french")) {
			switch (number) {
			case 1:
				System.out.println("un");
				break;
			case 2:
				System.out.println("deux");
				break;
			case 3:
				System.out.println("trois");
				break;
			default:
				System.out.println("invalid");
			}
		} else if (language.toLowerCase().equals("spanish")) {
			switch (number) {
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 3:
				System.out.println("tres");
				break;
			default:
				System.out.println("invalid");
			}

		} else if (language.toLowerCase().equals("english")) {
			switch (number) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("invalid");
			}
		} else {
			System.out.println("Invalid");
		}
		scnr.close();

	}

}
