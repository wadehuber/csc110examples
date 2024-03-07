package classexamples;

public class M6Methods {
	
	public static void banner() {
		System.out.println();
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println();
	}
	
	public static void printNTimes(String str, int count) {
		for (int ii=0; ii<count; ii++) {
			System.out.println(str);
		}
	}

	public static int addUpTo(int num) {
		int sum = 0;
		// add the numbers up to num
		for (int ii=1;ii<=num;ii++) {
			sum += ii;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		banner();
		

		System.out.println("The sum of the numbers up to 10 is " + addUpTo(10));
		System.out.println("The sum of the numbers up to 15 is " + addUpTo(15));
		System.out.println("The sum of the numbers up to 100 is " + addUpTo(100));
		
		banner();
		
		printNTimes("This is a string", 3);
		
		banner();
		
		printNTimes("Java Methods!", 5);
		
		banner();

	}

}
