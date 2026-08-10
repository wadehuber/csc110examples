package classexamples.module13files;

import java.io.*;
import java.util.Scanner;

public class FileIOExample {

	public static void main(String[] args) {
		
		String inputFileName = "src\\classexamples\\module13files\\input.txt";
		String outputFileName = "src\\classexamples\\module13files\\output.txt";
		
		Scanner inFile = null;
		PrintWriter outFile = null;
		String lineFromFile;
		int lineNo = 1;
		
		// Open a file for reading
		try {
			inFile = new Scanner(new FileReader(inputFileName));
		}
		catch (FileNotFoundException e) {
			System.out.println("INPUT FILE NOT FOUND: " + inputFileName);
			System.exit(-1);
		}
		
		// Open a file for writing
		try {
			outFile = new PrintWriter(outputFileName);
		}
		catch (FileNotFoundException e) {
			System.out.println("OUTPUT FILE NOT FOUND: " + outputFileName);
			System.exit(-1);
		}

		
		// Read the input file
		// We should be checking for exceptions here
		while (inFile.hasNextLine() ) {
			lineFromFile = inFile.nextLine();
			outFile.println(lineNo + ": " + lineFromFile);
			lineNo++;
		}
		
		
		// Close the files
		if (inFile != null) {
			inFile.close();
		}
		if (outFile != null) {
			outFile.close();
		}
		
	}

}
