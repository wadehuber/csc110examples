package videoexamples.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {

		int num = 10;	
		int beforeNum = 20;
		int afterNum = 30;
		int finallyNum = 40;
		int zero = 0;
		
		System.out.println("Before try block:");
		System.out.println("  num = " + num);
		System.out.println("  beforeNum = " + beforeNum);
		System.out.println("  afterNum = " + afterNum);
		System.out.println("  finallyNum = " + finallyNum);
		System.out.println();

		try {
			beforeNum = -20;
			num = 3 / zero;  // This will cause an exception
			afterNum = -30;
		}
		catch(ArithmeticException excep) {
			excep.printStackTrace();
			System.err.println("Hey, you can't divide by zero!");
		}
		finally {
			System.out.println("Finally, done with this.");
			finallyNum = -40;
		}
		
		System.out.println();
		System.out.println("After try block:");
		System.out.println("  num = " + num);
		System.out.println("  beforeNum = " + beforeNum);
		System.out.println("  afterNum = " + afterNum);
		System.out.println("  finallyNum = " + finallyNum);
	}
}