package classexamples.module07classes;

import java.util.Scanner;

public class SphereDriverWithNoClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Sphere Calculator.");
        System.out.print("Enter the sphere's radius: ");

        double radius = sc.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

        sc.close();
    }
}