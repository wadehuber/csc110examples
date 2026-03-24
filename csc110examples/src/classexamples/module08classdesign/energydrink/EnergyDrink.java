package classexamples.module08classdesign.energydrink;

public class EnergyDrink {

	String brand;
	String flavor;
	int caffine;
	int calories;
	Boolean sugarFree;
	
	public EnergyDrink(String brand, String flavor, int caffine, int calories, boolean sugarFree) {
		super();
		this.brand = brand;
		this.flavor = flavor;
		this.caffine = caffine;
		this.calories = calories;
		this.sugarFree = sugarFree;
	}
	
	void drink() {
		if (caffine >= 300) {
			System.out.println("I'M AWAKE");
		}
		else {
			System.out.println("I'm awake");
		}
	}

	@Override
	public String toString() {
		return "EnergyDrink [brand=" + brand + ", flavor=" + flavor + ", caffine=" + caffine + ", calories=" + calories
				+ ", sugarFree=" + sugarFree + "]";
	}

	
}
