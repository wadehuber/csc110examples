
package labs.javaio;
//Program Name : FileRDemo.java  Student starting File for Files Activity 1
//               Example of Reading from a file
//Author : P Baker
//Date : 
//Brief Description:  We will use this starting file to show an example
//                    of reading and writing to stream files.
//
//IOExceptions are checked exceptions.  So either must catch or list
//in method header.  We chose the later.
//
//Using Eclipse note:  Create a Java package under src.  All files must be
//                     inside the same Java package.  In my example
//                     I created a package called ch10Files.  So the path 
//                     for all files will be src/ch10Files/~~~~

import java.io.*; //needed for FileReader
import java.util.Scanner;


public class FileRDemo {

	public static void main(String[] s) throws IOException 
	{
		// Declare and instantiate the input file object and open the file
		// Note that you may need to update the path depending on your
		//   package structure
		Scanner inFile = new Scanner(new FileReader("src/labs/javaio/StudentGrades.txt"));
		
			
		String line; //variable to put each line as read

		// Use while because don't know how many lines in the file
		//   hasNextLine returns false when the end of the file is reached.
		while ( inFile.hasNextLine())
		{
			//read a line of text from the file
				
			//write the same line back out to the console - we aren't doing anything too fancy here


		}
		
	    //close the file
	}
}

/*Expected Output - nothing too fancy.  Just displaying what was read from the input file
Donald Duck,90,80,90
Minnie Mouse,90,98,92
Homer Simpson,60,70,75
*/