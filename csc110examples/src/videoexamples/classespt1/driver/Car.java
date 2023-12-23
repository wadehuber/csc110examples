package videoexamples.classespt1.driver;

public class Car {
	
	String make;
	String model;
	int year;
	double speed;
	
	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = 0.0;
	}

	// Accessor / Mutator methods
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	public void applyBrake(double reduction) {
		if (reduction > getSpeed()) {
			setSpeed(0.0);
		}
		else {
			setSpeed(getSpeed() - reduction);
		}
	}
	
	public void accelerate(double increase) {
		setSpeed(getSpeed() + increase);
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	

}
