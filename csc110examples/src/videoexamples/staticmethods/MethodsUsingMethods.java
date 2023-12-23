package videoexamples.staticmethods;

import java.util.Scanner;

public class MethodsUsingMethods {

	public static int areaOfARectangle(int l, int w) {
		return l * w;
	}
	
	public static void displayBrackets(int s) {
		System.out.println("[" + s + "]");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length, width;
		
		System.out.println("Rectangle Area");
		System.out.println("   Enter the width: ");
		width = scan.nextInt();
		System.out.println("  Enter the length: ");
		length = scan.nextInt();
	
		displayBrackets(areaOfARectangle(length, width));

	}

}
