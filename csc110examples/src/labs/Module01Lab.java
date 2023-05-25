package labs;

import java.util.Scanner;

public class Module01Lab {

	public static void main(String[] args) {

        // Print "Hello, World", ending with a newline

		
    	// Using two statements, print "Computer Science"

		
    	// The code below creates a variable called answer
    	//  Print the statement "The answer is " followed
    	//  by the value in answer on a single line.
	    int answer = 42;

	    
    	// The code below lets the user input two numbers
    	//   stored in the variables num1 & num2. Print the
	    //   two numbers, then print their sum & product.
        Scanner scnr = new Scanner(System.in);
	    int num1;
	    int num2;
        System.out.println("Enter 2 integers:");
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
       
        scnr.close(); // Always close your resources!
    }
    
}
