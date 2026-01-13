package classexamples.module08classdesign.energydrink;

public class EnergyDrink {
	
	String brand;
	String flavor;
	int calories;
	int caffine;
	Boolean sugarFree;
	
	public EnergyDrink(String brand, String flavor, int calories, int caffine, Boolean sugarFree) {
		super();
		this.brand = brand;
		this.flavor = flavor;
		this.calories = calories;
		this.caffine = caffine;
		this.sugarFree = sugarFree;
	}
	
	void drink() {
		if (caffine >= 300 ) {
			System.out.println("I'M AWAKE!");
		}
		else {
			System.out.println("I'm awake.");
		}

	}

	@Override
	public String toString() {
		return "EnergyDrink [brand=" + brand + ", flavor=" + flavor + ", calories=" + calories + ", caffine=" + caffine
				+ ", sugarFree=" + sugarFree + "]";
	}
	
	
	
}
