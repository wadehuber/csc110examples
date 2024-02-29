package classexamples;

import java.util.Scanner;

public class M5Loops {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int limit = scan.nextInt();
		
		// while loops
		int num = 1;
		while (num <= limit) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		
		int sum = 0;
		num = 1;
		while (num <= limit) {
			sum += num;  // add num to sum
			num++;
		}
		System.out.println("Sum = " + sum);
		
		// do-while loop
		num = 1;
		do {
			System.out.println(num);
			num++;
		} while (num <= limit);
		
		// for loop
		for (int ii=1; ii<=10; ii++) {
			System.out.println(10 * ii);
		}
		
		scan.close();

	}

}
