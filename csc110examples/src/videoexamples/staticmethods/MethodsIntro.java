package videoexamples.staticmethods;

public class MethodsIntro {

	public static double mean(int[] values) {
		int sum = 0;
		double average;
		for (int ii=0;ii<values.length;ii++) {
			sum += values[ii];
		}
		return (double) sum / values.length;
	}
	
	public static void main(String[] args) {
		int[] numbers = {10, 17, 13, 24, 9};
		
		int sum = 0;
		double average;
		for (int ii=0;ii<numbers.length;ii++) {
			sum += numbers[ii];
		}
		average = (double) sum / numbers.length;
		System.out.println("Average = " + average);
		System.out.println("Mean = " + mean(numbers));
	

	}

}
