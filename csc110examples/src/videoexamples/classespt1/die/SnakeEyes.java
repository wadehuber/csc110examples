//********************************************************************
//  SnakeEyes.java       Java Foundations
//
//  Demonstrates the use of a programmer-defined class.
//********************************************************************
package videoexamples.classespt1.die;

public class SnakeEyes {
	   //-----------------------------------------------------------------
	   //  Creates two Die objects and rolls them several times, counting
	   //  the number of snake eyes that occur.
	   //-----------------------------------------------------------------
	   public static void main (String[] args)
	   {
	      final int ROLLS = 720;
	      int count = 0;
	      
	      Die die1 = new Die(6);
	      Die die2 = new Die(6);
	      
	      for (int roll=1; roll <= ROLLS; roll++)
	      {
	    	 die1.roll();
	    	 die2.roll();
	    	 
	    	 System.out.println(die1 + " " + die2);
	 
	         if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1)    
	            count++;
	      }
	 
	      System.out.println ("\nNumber of rolls: " + ROLLS);
	      System.out.println ("Number of snake eyes: " + count);
	      System.out.println ("Ratio: " + (float)count / ROLLS);
	   }
}