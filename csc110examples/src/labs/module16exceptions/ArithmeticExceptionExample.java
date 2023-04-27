package labs.module16exceptions;

import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter a non-zero divisor: ");
        int divisor = scanner.nextInt();

        scanner.close();

        int result = dividend / divisor;

        System.out.println("Result: " + result);
    }
}