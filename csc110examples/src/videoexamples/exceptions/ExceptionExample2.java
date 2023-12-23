package videoexamples.exceptions;

public class ExceptionExample2 {
	public static void main(String args[]) {
		System.out.println("START");
		
		doExample(10);

		System.out.println();
		doExample(- 10);

		System.out.println("END");
	}
	
	public static void doExample(Integer num) {
		System.out.println("\tSTART doExample " + num);

		try {
			checkNumber(num);
		}
		catch (IllegalArgumentException e) {
			System.err.println("\tEXCEPTION in doExample: illegal argument " + num);
			return;  // finally block will run even with this return
		}
		finally {
			System.out.println("\tFINALLY doExample " + num);
		}

		System.out.println("\tEND doExample " + num);
	}

	public static void checkNumber(Integer num) {
		System.out.println("\t\tSTART checkNumber " + num);
		if (num < 0) {
			throw new IllegalArgumentException();
		}
		System.out.println("\t\tEND checkNumber " + num);
	}

}