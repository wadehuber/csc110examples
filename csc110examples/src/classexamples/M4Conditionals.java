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

		if (num1 <= num2) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}

		if (str1.compareTo(str2) > 0) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}

		if (str3.compareTo(str1) > 0) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}

	}

}
