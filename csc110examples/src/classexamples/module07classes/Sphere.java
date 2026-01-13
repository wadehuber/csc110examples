package classexamples.module07classes;

public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

	@Override
	public String toString() {
		return "Sphere [radius=" + getRadius() + ", volume=" + getVolume()
				+ ", surface area=" + getSurfaceArea() + "]";
	}

}
