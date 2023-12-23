package videoexamples.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample {
	public static void main (String args[]) {
		File file = new File("example.txt");
		
		System.out.println("Creating new file ...");
		try {
			file.createNewFile();
		} 
		catch (IOException e) {
			System.err.println("There was a problem creating the file.");
			System.exit(0);
		}
		
		// Try-with-resources - implicit finally block with close()
		System.out.println("Writing to file ...");
		try (FileWriter fw = new FileWriter(file)) {
			fw.write("This is a test for CSC205\n");
			fw.flush();
		} 
		catch (IOException excep) {
			System.err.println("Something went wrong while writing the file");
		}
		System.out.println("Done!");
		

		System.out.println();
		System.out.println("Reading from file ...");
		try (FileReader fr = new FileReader(file);) {
			char[] inputChars = new char[100];
			fr.read(inputChars);
			System.out.println("Contents of the file: " + new String(inputChars));
			
		}
		catch (IOException excep) {
			System.err.println("Something went wrong while writing the file: " + excep.getMessage());
		}
		System.out.println("Done!");
	}
}
