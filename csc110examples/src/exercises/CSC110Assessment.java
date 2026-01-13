package exercises;

public class CSC110Assessment {

	public static void main(String[] args) {
		String[] names = { "Alice", "Bob", "Charlie" };
		double[] gpas = { 3.5, 2.8, 4.0 };
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i] + ": " + gpas[i]);
		}

		System.out.print(names[0] + " grade: ");
		if (gpas[0] > 3.0) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
		
		System.out.print(names[1] + " grade: ");
		if (gpas[1] > 3.0) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}

		System.out.print(names[2] + " grade: ");
		if (gpas[2] > 3.0) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
	}
}