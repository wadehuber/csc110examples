package classexamples.module12exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionProp {

	public static void function1() {
		System.out.println("    FUNCTION1: Start");
		function2();
		System.out.println("    FUNCTION1: End");
	}

	public static void function2() {
		System.out.println("        FUNCTION2: Start");
		function3();
		System.out.println("        FUNCTION2: End");
	}

	public static void function3() {
		System.out.println("            FUNCTION3: Start");
		
		// Use try-with-resources so the Scanner gets closed
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("            Enter a number: " );
			int div = scan.nextInt();
			int x = 10 / div;
		}
		catch (InputMismatchException e) {
			System.out.println("FUNCTION3: Invalid input. Do better!");
		}
		finally {
			System.out.println("            FUNCTION3: Finally block closes the Scanner");
		}
		System.out.println("            FUNCTION3: End");
	}

	public static void main(String[] args) {
		System.out.println("MAIN: Start");
		function1();
		System.out.println("MAIN: End");
	}

}
