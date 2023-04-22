package labs.javaio.solution;
//Program Name : FileRW.java   Solution File for Files Activity 2
//Example of Reading and Writing from a file
//Author : P Baker
//Date : 
//Brief Description:  We will use this starting file to show an example
//   of reading and writing to stream files.
//
//Using Eclipse note:  Create a Java package under src.  All files must be
//    inside the same Java package.  In my example
//    I created a package called ch10Files.  So the path 
//    for all files will be src/ch10Files/~~~~

import java.io.*; //needed for FileReader and PrintWriter
import java.util.Scanner;


public class FileRW {

	public static void main(String[] s) throws IOException 
	{
		//declare and instantiate the input file object and open the file
		Scanner inFile = new Scanner(new FileReader("src/labs/javaio/StudentGrades.txt"));
		//declare and instantiate the output file object and open the file
		PrintWriter outFile = new PrintWriter("src/labs/javaio/solutions/GradeReport.txt");

		
		String line; //variable to put each line as read
		
		//write the nice title lines to the output file
		outFile.println("Java Class Grade Report");
		outFile.println("-----------------------");

		/*use while because don't know how many lines in the file
		  hasNextLine returns false when the end of the file is reached. */

		while ( inFile.hasNextLine())
		{

				line = inFile.nextLine();			
				System.out.println(line);  //write to the console
				outFile.println(line);  //write each line to the output file

		}
			inFile.close();    //close the file
			outFile.close();   //Note : the file will not post without closing		
	}

}

/*contents of GradeReport.txt after running code

Java Class Grade Report
-----------------------
Donald Duck,90,80,90
Minnie Mouse,90,98,92
Homer Simpson,60,70,75

*/