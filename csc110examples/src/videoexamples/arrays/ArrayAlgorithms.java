package videoexamples.arrays;

public class ArrayAlgorithms {

	public static int findMax(int[] arr) {
		int max = arr[0];
		
		for (int ii=0; ii<arr.length; ii++) {
			if (arr[ii] > max) {
				max = arr[ii];
			}
		}
		return max;
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		
		for (int ii=0; ii<arr.length; ii++) {
			if (arr[ii] < min) {
				min = arr[ii];
			}
		}
		return min;
	}

	public static int countGreaterThan(int[] arr, int value) {
		int count = 0;
		
		for (int ii=0; ii<arr.length; ii++) {
			if (arr[ii] > value) {
				count ++;
			}
		}
		return count;
	}
	
	
	

	public static void main(String[] args) {
		int[] values = {42, 8, 73, 35, 21};
		
		System.out.println("Min value is " + findMin(values));
		System.out.println("Max value is " + findMax(values));
		System.out.println("Number of values > 0 " + countGreaterThan(values,0));
		System.out.println("Number of values > 20 " + countGreaterThan(values,20));
		System.out.println("Number of values > 50 " + countGreaterThan(values,50));


	}

}
