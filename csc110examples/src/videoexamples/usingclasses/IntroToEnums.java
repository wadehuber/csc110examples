package videoexamples.usingclasses;

public class IntroToEnums {
	
	public enum Cities { PHOENIX, SEATTLE, DALLAS, CHICAGO }
	
	public static void main(String[] args) {
		
		Cities home = Cities.PHOENIX;
		Cities destination = Cities.CHICAGO;
		
		if ((home == Cities.PHOENIX || home == Cities.SEATTLE)) {
			System.out.println("Departure at 9:30AM from " + home);
		}
		else {
			System.out.println("No flights available from " + home);
		}

		// for-each loop
		for (Cities city : Cities.values()) {
			System.out.println(city);
		}
		
	}

}
