package videoexamples.classespt1.driver;

public class CarDriver {

	public static void main(String[] args) {
		System.out.println("Driver for Car class used to test our Car class");
		
		// Create 3 Car objects
		Car car1 = new Car("Chevrolet", "Corvette", 1966);
		Car car2 = new Car("Ford", "Mustang", 1993);
		Car car3 = new Car("Honda", "Civic", 2020);
		
		// Print the Car objects by using the toString implicitly
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println();
		
		// Test the behaviors of our Car class
		car1.accelerate(50);
		car2.accelerate(75);
		car3.accelerate(60);
		
		car2.applyBrake(5);
		car3.applyBrake(100);

		System.out.println(car1 + " is going " + car1.getSpeed() + "mph");
		System.out.println(car2 + " is going " + car2.getSpeed() + "mph");
		System.out.println(car3 + " is going " + car3.getSpeed() + "mph");

	}

}
