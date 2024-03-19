package videoexamples.staticmethods;

public class LocalVariables {

	public static int times10(int num) {
		// local variables
		int multiplier = 10;
		
		// num = 4;
		
		return num * multiplier;
	}

	public static void main(String[] args) {
	
		for(int ii=0;ii<=20;ii+=4) {
			System.out.println("times10(" + ii + ") = " + times10(ii));
		}
		
	}

}
