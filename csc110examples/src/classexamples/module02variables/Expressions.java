package classexamples.module02variables;

public class Expressions {
	
	public static void main (String args[]) {
		int a = 7;
		int b = 3;
		
		double m = .99;
		double n = 12345 / 678.0;
		
		System.out.println("a = " + a + " b = " + b);
		System.out.println("m = " + m + " n = " + n);
		
		int x = a * a + 4 * b;
		System.out.println("a * a + 4 * b = " + (a * a + 4 * b));
		System.out.println("x = " + x);
		System.out.println("x * 10 = " + (x * 10));
		
		x = x * x;
		System.out.println("x = " + x);

	}

}
