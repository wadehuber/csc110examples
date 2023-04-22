package labs.javaio.solution;
//Program Name : FileR.java   Solution File for Files Activity 1
//Example of Reading from a file
//Author : P Baker
//Date : 
//Brief Description:  We will use this starting file to show an example
//   of reading and writing to stream files.

//Many operations performed by I/O classes can throw an IOException.
//IOExceptions are checked exceptions.  So either must catch or list
//  in method header.  We chose the later.
//
//Using Eclipse note:  Create a Java package under src.  All files must be
//    inside the same Java package.  In my example
//    I created a package called ch10Files.  So the path 
//    for all files will be src/ch10Files/~~~~

import java.io.*; //needed for FileReader
import java.util.Scanner;


public class FileR {

	public static void main(String[] s) throws IOException
	{
		//declare and instantiate the input file object and open the file
		Scanner inFile = new Scanner(new FileReader("src/labs/javaio/StudentGrades.txt"));  
	

		String line; //variable to put each line as read

		/*use while because don't know how many lines in the file
		  hasNextLine returns false when the end of the file is reached. */

		while ( inFile.hasNextLine())
		{

			line = inFile.nextLine();
				
			System.out.println(line);

		}
			inFile.close();    //close the file		
		
	}
}
/*StudentGrades.txt file contents
Donald Duck,90,80,90
Minnie Mouse,90,98,92
Homer Simpson,60,70,75
*/