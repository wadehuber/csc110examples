package videoexamples.inheritance.animals;

public abstract class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}

    public abstract void speak();
    
    public void move() {
    	System.out.println(name + " is moving like an animal.");
    }
    
    public String getName() {
    	return this.name;
    }
}
