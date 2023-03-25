package videoexamples.module12classes.tostring;

public class ToStringExample {

	public static void main(String[] args) {
		Movie top2022Movies[] = {
		    new Movie("Top Gun: Maverick", 691185348, 4751, "May 27"),
		    new Movie("Doctor Strange in the Multiverse of Madness", 411331607, 4534, "May 6"),
		    new Movie("Jurassic World Dominion", 374817385, 4697, "Jun 10"),
		    new Movie("The Batman", 369345583, 4417, "Mar 4"),
		    new Movie("Minions: The Rise of Gru", 354751145, 4427, "Jul 1"),
		    new Movie("Thor: Love and Thunder", 336514972, 4375, "Jul 8"),
		    new Movie("Spider-Man: No Way Home", 231808708, 4336, "Dec 17"),
		    new Movie("Sonic the Hedgehog 2", 190872904, 4258, "Apr 8"),
		    new Movie("Uncharted", 148649929, 4275, "Feb 18"),
		    new Movie("Elvis", 147347379, 3932, "Jun 24")
		};
		
		for(int ii=0;ii<top2022Movies.length; ii++) {
			System.out.println("  " + ii + ": " + top2022Movies[ii] + " made $" + top2022Movies[ii].getGross());
		}
		
	}

}
