package videoexamples.introtojava;

/**
 * This class demonstrates the three types of comments in Java:
 *  - Single-line comments (C++ style)
 *  - Multi-line comments (C style)
 *  - JavaDoc comments
 *    
 * This is a JavaDoc comment.
 * JavaDoc is used to describe classes and methods.
 *
 * JavaDoc comments can be turned into documentation.
 * 
 */

public class Comments {
	
	/**
	 * This is the main method
	 * 
	 * Every Java program starts running here
	 * 
	 * And this is a JavaDoc comment
	 */
	
	public static void main(String[] args) {

        // Single-line comments start with // and go to the end of the line

        /* Multi-line comments start with a slash followed by an asterisk
         * and end with an asterisk followed by a slash.
         *
         * They can be any number of lines.
         *
         * The * at the start of each line inside the comment
         * is purely cosmetic and not required.
         */
		
		System.out.println("Comments don't get printed.");
		

	}
	
}
