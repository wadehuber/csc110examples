package videoexamples.inheritance;

import videoexamples.inheritance.animals.*;

public class  MyAnimals{

	public static void main(String[] args) {
		// Animal a = new Animal("George");  // Can't instantiate an animal
		
		Dog d = new Dog("Buck");
		Cat c = new Cat("Eek");
		Animal a = new Dog("Copper");
		
		System.out.println("Dog d: ");
		d.speak();
		d.move();
		d.fetch();
		System.out.println();

		System.out.println("Cat c: ");
		c.speak();
		c.move();
		System.out.println();
		
		System.out.println("Animal a: ");
		a.speak();
		a.move();
		// a.fetch();   // Animals don't know how to fetch
		System.out.println();

	}
}
