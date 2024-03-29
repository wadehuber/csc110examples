package labs.exceptions;

import java.util.Scanner;

public class ThrowArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a dividend: ");
        double dividend = scanner.nextDouble();

        System.out.print("Enter a non-zero divisor: ");
        double divisor = scanner.nextDouble();

        scanner.close();

        double result = dividend / divisor;

        System.out.println("Result: " + result);
    }
}