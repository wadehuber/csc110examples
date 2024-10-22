package classexamples.module8classdesign;

public class EnergyDrink {
	String brand;
	String flavor;
	int caffine;
	int calories;
	Boolean sugarFree;
	
	public EnergyDrink(String b, String f, int c, int cal, Boolean sf) {
		super();
		this.brand = b;
		this.flavor = f;
		this.caffine = c;
		this.calories = cal;
		this.sugarFree = sf;
	}

	public String getBrand() {
		return brand;
	}

	public String getFlavor() {
		return flavor;
	}

	public int getCaffine() {
		return caffine;
	}

	public int getCalories() {
		return calories;
	}

	public Boolean getSugarFree() {
		return sugarFree;
	}

	@Override
	public String toString() {
		String sf = "";
		if (sugarFree) {
			sf = "Sugar Free";
		}
		return flavor + " " + brand + " " + sf ;
	}
	
	
	
	
}
