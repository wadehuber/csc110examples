package videoexamples.module02;

public class StringConcatenation {

	public static void main(String[] args) {
		Integer num = 42;
		Double pi = 3.14159;
		String subject = "CSC";

		// String concatenation 	
		System.out.println("String" + "Concatenation");
		System.out.println("Where is the any key? " + "- Homer Simpson");
		System.out.println("The " + "Eagle " + "has " + "landed");
		System.out.println("Let's play " + 2);
		System.out.println("The answer is: " + num);
		System.out.println("I like " + pi);
		System.out.println("I'm taking " + subject + "110");
		/*
		System.out.println("The greatest enemy of knowledge is not 
							ignorance, it is the illusion of 
							knowledge. — Stephen Hawking");
		*/
		System.out.println("The greatest enemy of knowledge is not "
				         + "ignorance, it is the illusion of "
				         + "knowledge. — Stephen Hawking");
	}

}
