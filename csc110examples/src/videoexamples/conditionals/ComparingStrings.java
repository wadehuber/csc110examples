package videoexamples.conditionals;

import java.util.Scanner;

public class ComparingStrings {

	final static String PASSWORD = "P@ssw0rd";

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userPassword;
	
		System.out.println("Enter the password: ");
		userPassword = scnr.next();
		
		if (userPassword.equals(PASSWORD)) {
			System.out.println("You may enter ...");
		}
		else {
			System.out.println("YOU MAY NOT ENTER!");
		}
		scnr.close();
	}

}
