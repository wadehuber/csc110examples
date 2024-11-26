package classexamples.module13files;

import java.io.*;
import java.util.Scanner;

public class FileIOExample {

	public static void main(String[] args) {
		
		String inputFileName = "src\\classexamples\\module13files\\input.txt";
		String outputFileName = "src\\classexamples\\module13files\\output.txt";
		Scanner inFile = null;
		String lineFromFile;
		PrintWriter outFile = null;
		int lineNo = 1;

		// Open a file for reading
		try {
			inFile = new Scanner(new FileReader(inputFileName));
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND: " + inputFileName);
			e.printStackTrace();
			System.exit(-1);
		}
		
		// Open a file for writing
		try {
			outFile = new PrintWriter(outputFileName);
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND: " + outputFileName);
			e.printStackTrace();
			System.exit(-1);
		}
		
		// Read the input file & write to output file
		// We should be checking for exceptions here!
		while(inFile.hasNextLine()) {
			lineFromFile = inFile.nextLine();
			outFile.println(lineNo + "(" + lineFromFile.length() + "): " + lineFromFile);

			lineNo++;
		}

		// Close the file
		if (inFile != null) {
			inFile.close();
		}
		if (outFile != null) {
			outFile.close();
		}
	}

}
