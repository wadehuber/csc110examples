package videoexamples.exceptions.creatingexcept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreatingExceptions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		try 
		{
				
			System.out.print ("Enter a number:  ");
			num = scan.nextInt();		
			
			if (num == 13) {
				throw (new YouDidTheWrongThingException("UNLUCKY NUMBER!"));
			}

		    System.out.println ("Numbers up to " + num + ":");
			for (int ii=0;ii<num;ii++) {
			    System.out.print(ii + " ");
			}
		    System.out.println ();
			
		}
		catch (InputMismatchException e)
		{
			System.err.println("Invalid input type.");
		}
		catch (YouDidTheWrongThingException e)
		{
			System.err.println(e.getMessage());
		}
	}

}
