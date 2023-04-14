package videoexamples.module14inheritance.animals;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

    public void speak() {
    	System.out.println("Woof! Woof!");
    }
    
    public void move() {
    	System.out.println(name + " is running!");
    }

    public void fetch() {
    	System.out.println("Ball! Ball!");
    }

}
