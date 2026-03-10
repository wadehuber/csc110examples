package classexamples.module07classes;

import java.util.Scanner;

public class SphereDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Sphere Calculator.");
        System.out.print("Enter the sphere's radius: ");

        double userInput = sc.nextDouble();

        Sphere sphere1 = new Sphere(userInput);
        System.out.println(sphere1);

        sc.close();
    }
}