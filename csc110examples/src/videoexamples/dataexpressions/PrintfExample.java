package videoexamples.dataexpressions;

public class PrintfExample {

	public static void main(String[] args) {
		
		String name = "Kendra Sorenson";
		int age = 13;
		double number = 1234.5678;

		System.out.println(name + " is " + age + " years old, number=" + number);

		// printf takes a single format string as its first parameter
		//  the format string has format specifiers that get replaced by the 
		//      values passed as parameters 2 and following
		//  %s indicates a string
		//  %d indicates an integer
		//  %f indicates a double
		//    %.2f indicates a double rounded to 2 decimal places
		System.out.printf("%s is %d years old, number=%.2f\n", name, age, number);
		System.out.format("%20s is %10d years old, number=%10.2f\n", name, age, number);

	}

}
