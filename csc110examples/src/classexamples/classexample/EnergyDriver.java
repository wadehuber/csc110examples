package classexamples.classexample;

public class EnergyDriver {

	public static void main(String[] args) {
		
		EnergyDrink jaceDrink = new EnergyDrink("Ghost", "Blue Raspberry", 5, 200, true);
		EnergyDrink otherDrink = new EnergyDrink("NeverSleep", "Battery Acid", 450, 500, false);
		System.out.println(jaceDrink);
		System.out.println(otherDrink);
		
		jaceDrink.drink();
		otherDrink.drink();

	}

}
