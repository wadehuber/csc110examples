package videoexamples.loops;

public class LoopingString {

	public static void main(String[] args) {
		String sentence = "Open the pod bay doors, please, HAL";
		int numSpaces = 0;
		
		for (int ii=0; ii<sentence.length(); ii++) {
			// Get character at the index
			char c = sentence.charAt(ii);
			
			// Get the integer value of the character
			int asciiValue = (int) c;
			
			// Here shift the character by 1 and print
			System.out.print("[" + Character.toString(asciiValue+1) + "]");

			if (c == ' ') {
				numSpaces++;
			}
		}
		System.out.println();
		System.out.println();
		
		// Notice the escape sequence used to print double quotes - \"
		System.out.print("The sentence: \"" + sentence + "\" ");
		System.out.println("has " + numSpaces + " spaces.");
		

	}

}
