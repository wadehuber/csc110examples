package videoexamples.module02;

public class Constants {

	public static void main(String[] args) {
		
		final int birthYear = 2004;
		int age = 19;
		
		System.out.print("I was born in " + birthYear + ". ");
		System.out.println("I am " + age + " years old.");
		
		age = 20;
		// birthYear = 2000;  // Cannot change a constant variable's value
		System.out.print("I was born in " + birthYear + ". ");
		System.out.println("I am " + age + " years old.");
	}

}
