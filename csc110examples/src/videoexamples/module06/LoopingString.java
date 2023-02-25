package videoexamples.module06;

public class LoopingString {

	public static void main(String[] args) {
		String sentence = "Open the pod bay doors, please, HAL";
		int numSpaces = 0;
		
		for(int ii=0; ii<sentence.length(); ii++) {
			if (sentence.charAt(ii) == ' ') {
				numSpaces ++;
			}
		}
		
		// Notice the escape sequence used to print double quotes - \"
		System.out.println("The sentence: \"" + sentence + "\"");
		System.out.println("has " + numSpaces + " spaces.");
		

	}

}
