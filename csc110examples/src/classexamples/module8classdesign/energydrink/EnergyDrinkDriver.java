package classexamples.module8classdesign.energydrink;

public class EnergyDrinkDriver {

	public static void main(String[] args) {
		EnergyDrink drink = new EnergyDrink("Monster", "Blueberry", 10, 10, false);
		EnergyDrink drink2 = new EnergyDrink("Red Bull", "Cherry", 11, 8, true); 

		System.out.println("drink = " + drink);
		System.out.println("drink2 = " + drink2);
	}

}
