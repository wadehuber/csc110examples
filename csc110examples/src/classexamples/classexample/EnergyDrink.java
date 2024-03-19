package classexamples.classexample;

public class EnergyDrink {

	String brand;
	String flavor;
	int calories;
	int caffine;
	Boolean sugarFree;

	// Constructor
	EnergyDrink(String b, String f, int cal, int caf, Boolean sugarFree) {
		brand = b;
		flavor = f;
		calories = cal;
		caffine = caf;
		this.sugarFree = sugarFree;
	}

	void drink() {
		if (caffine >= 300) {
			System.out.println("I'M AWAKE!");
		} else {
			System.out.println("I'm awake");
		}
	}
	
	@Override
	public String toString() {
		return "EnergyDrink [brand=" + brand + ", flavor=" + flavor + ", calories=" + calories + ", caffine=" + caffine
				+ ", sugarFree=" + sugarFree + "]";
	}


}
