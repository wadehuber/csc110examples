package classexamples.module07classes;

import java.util.Scanner;

public class SphereDriverWithNoClass {

	public static void main(String[] args) {
		double radius, surfaceArea, volume;
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Sphere Calculator.");
		System.out.print("Enter the sphere's radius: ");

		radius = sc.nextDouble();
		volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

		System.out.println("Radius: " + radius);
		System.out.println("Volume: " + volume);
		System.out.println("Surface area: " + surfaceArea);
		
		sc.close();
	}
}