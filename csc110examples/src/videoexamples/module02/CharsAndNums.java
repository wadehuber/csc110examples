package videoexamples.module02;

public class CharsAndNums {

	public static void main(String[] args) {
		System.out.println("Characters & their numeric representation");
		
		char char1 = 'a';
		char char2 = 67;
		char char3 = 'a' + 5;
		
		int int1 = 122;
		int int2 = 'A' + 10;
		
		System.out.println("char1 = " + char1);
		System.out.println("(int) char1 = " + (int) char1);
		System.out.println("char2 = " + char2);
		System.out.println("char3 = " + char3);
		System.out.println("int1 = " + int1 + " as char: " + (char) int1);
		System.out.println("int2 = " + int2 + " as char: " + (char) int2);
		
	}

}
