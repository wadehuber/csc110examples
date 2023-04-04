package videoexamples.module12classes.driver;

public class Car {

	String make;
	String model;
	int year;
	double speed;
	
	public Car(String make, String model, int year, double speed) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
	}
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
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	
	
}
