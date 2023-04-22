package labs.javaio.solution;
//Program Name : FileRWToken.java   File for Files Activity 3
//Example of Reading and Writing from a file.  Parsing/tokenizing data.
//Author : P Baker
//Date : 
//Brief Description:  We will use this file to show an example
//   of reading and writing to stream files.
//
//Using Eclipse note:  Create a Java package under src.  All files must be
//    inside the same Java package.  In my example
//    I created a package called ch10Files.  So the path 
//    for all files will be src/ch10Files/~~~~


import java.io.*; //needed for FileReader
import java.util.Scanner;
import java.text.DecimalFormat;


public class FileRWToken {

	public static void main(String[] s) throws IOException
	{
		//declare and instantiate the input file object and open the file
		Scanner inFile = new Scanner(new FileReader("src/ch10Files/StudentGrades.txt"));
		//declare and instantiate the output file object and open the file
		PrintWriter outFile = new PrintWriter("src/ch10Files/GradeReport.txt");
		
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		String line; //variable to put each line as read
		String name;
		int exam1, exam2, exam3;
		
		//write the nice title lines to console and the output file
		System.out.println("Java Class Grade Report");
		System.out.println("-----------------------");
		
		outFile.println("Java Class Grade Report");
		outFile.println("-----------------------");
			
			/*will use the Scanner class to break apart our
			 *variable "line" into separate items (or tokens).  In this
			 *case we set the delimiter to be a comma ",".  So "line"
			 *will be broken into separate items (tokens) when each 
			 *comma is encountered.  Use the next() method to fetch
			 *each token that is a String.  Use the nextInt() method to
			 *fetch each token that is an integer.  Then process each item (token)
			 *as needed.  In our case we read the first item as name and
			 *the next items as exam scores.
			 *
			 *Of course, this code works because we know ahead of time 
			 *how our file is organized.
			 *
			 *Finally, we calculate an average exam score and write the
			 *result back to the output file GradeReport.txt.
			 */

		while ( inFile.hasNextLine())
		{
			line = inFile.nextLine();
				
			Scanner tokens = new Scanner(line);
			tokens.useDelimiter(",");
				
			name = tokens.next(); //returns a String
			exam1 = tokens.nextInt();
			exam2 = tokens.nextInt();
			exam3 = tokens.nextInt();
				
			System.out.println(name + " has an exam average of "
						+fmt.format( (exam1 + exam2 + exam3)/3.0 )
						+ ".");
				
			outFile.println(name + " has an exam average of "
						+fmt.format( (exam1 + exam2 + exam3)/3.0 )
						+ ".");
				
			tokens.close();

		}
		inFile.close();       //close the file
		outFile.close();
	}

}
/*  Example output to System.out and outFile
  
Java Class Grade Report
-----------------------
Donald Duck has an exam average of 86.67.
Minnie Mouse has an exam average of 93.33.
Homer Simpson has an exam average of 68.33.
  
*/
