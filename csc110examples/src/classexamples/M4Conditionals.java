package classexamples;

public class M4Conditionals {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 33;
		
		String str1 = "Percy";
		String str2 = "Annabeth";
		String str3 = "grover";
		
		
		if (num1 > num2) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		System.out.println();

		if (num3 > num2) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		System.out.println();

		String str4 = new String("Percy");
		if (str1.equals(str4)) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		System.out.println();

		if (str1.compareTo(str2) < 0) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		System.out.println();

		if ("ABCDEFG".compareTo("ABCDABCDEFG") > 0) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		System.out.println();

		if (str2.compareTo(str3) > 0) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		System.out.println();
		
		if (num1 < (num2 / 4)) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		System.out.println();

		// Using logical and
		if ((num2 > num1) && (num2 > num3)) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		System.out.println();

		// Using logical or
		if ((num2 > num1) || (num2 > num3)) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		System.out.println();

		

	}

}
