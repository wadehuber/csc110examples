package videoexamples.usingclasses;

public class StringConcatenation {

	public static void main(String[] args) {
		Integer num = 42;
		Double pi = 3.14159;
		String subject = "CSC";

		// String concatenation
		System.out.println("String" + "Concatenation");
		System.out.println("The " + "eagle " + "has " + "landed");
		System.out.println("String" + " " + "Concatenation");
		System.out.println("The answer is " + num);
		System.out.println("I like " + pi);
		System.out.println("I'm taking " + subject + 110);
		System.out.println("The greatest enemy of knowledge is not ignorance, " +
		                   "it is the illusion of knowledge. � Stephen Hawking");
		
		// Be careful using + with numbers - you can concatenate integers,
		//   so use () if you want to print the result of the addition!
		System.out.println("The number " + num + " + " + 17 + " = " + num+17);
		System.out.println("The number " + num + " + " + 17 + " = " + (num+17));
		
		// 
		System.out.println('a' + 'B');
		System.out.println("" + 'a' + 'B');
		
	}

}
