package classexamples.module07classes;

public class Sphere {

	private double radius;

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getDiameter () {
		return 2 * radius;
	}

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
    	return 2.0 * radius * Math.PI;
    }

	@Override
	public String toString() {
		return "Sphere [" +
				"\n\tradius = " + radius + 
				"\n\tdiameter = " + getDiameter() + 
				"\n\tvolume = " + getVolume() + 
				"\n\tsurface area = " + getSurfaceArea() + 
				"\n\tcircumference = " + getCircumference() +
				"\n]";
	}

    
}
