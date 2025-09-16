package classexamples.module05loops;

public class LoopReview {

	public static void main(String[] args) {
		
		// Print the multiples of 3 <= 25
		// By checking each value
		System.out.println("Multiples of 3: ");
		for(int ii=1; ii<=25; ii++) {
			if (ii % 3 == 0) {
				System.out.print(ii + " ");
			}
		}
		System.out.println();
		
		// Print the multiples of 5 <= 45
		// By incrementing by 5
		System.out.println("Multiples of 5: ");
		for(int ii=5; ii<=45; ii+=5) {
			System.out.print(ii + " ");
		}
		System.out.println();
		System.out.println();
		
		// Count to 3 10 times
		System.out.println("Count to 3 10 times: ");
		// Use nested loops
		int count = 1;
		System.out.print("Nested loops: ");
		while (count <= 10) {
			for(int ii=1;ii<=3;ii++) {
				System.out.print(ii);
			}
			count ++;
		}
		System.out.println();
		
		// Alternate method - use modulo to generate the numbers
		System.out.print("One loop using modulo: ");
		for(int ii=0;ii<30;ii++) {
			System.out.print(ii%3+1);
		}
		System.out.println();
		
		// Print the characters of a string until you get to 'y'
		String str = "To infinity and beyond!";
		System.out.println("Print the characters of a string until you get to 'y':");
		System.out.print("Using a for loop: ");
		for (int ii=0;ii<=str.length() && str.charAt(ii)!='y';ii++) {
			System.out.print(str.charAt(ii));
		}
		System.out.println();

		System.out.print("Using a while loop: ");
		int index = 0;
		while(index<=str.length() && str.charAt(index)!='y') {
			System.out.print(str.charAt(index));
			index ++;
		}
		

	}

}
