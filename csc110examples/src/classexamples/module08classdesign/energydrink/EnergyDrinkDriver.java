package classexamples.module08classdesign.energydrink;

public class EnergyDrinkDriver {

	public static void main(String[] args) {
		
		EnergyDrink drink1 = new EnergyDrink("Monster", "White", 100, 150, false);
		EnergyDrink drink2 = new EnergyDrink("Mountain Dew", "Baja Blast", 170, 59, false);
		
		System.out.println("Drink1: " + drink1);
		System.out.println("Drink2: " + drink2);
		
	}

}
