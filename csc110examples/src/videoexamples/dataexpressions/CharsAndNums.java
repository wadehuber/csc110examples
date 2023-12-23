package videoexamples.dataexpressions;

public class CharsAndNums {

	public static void main(String[] args) {
		System.out.println("Characters & their numeric representation");
		
		char char1 = 'a';
		char char2 = 87;
		char char3 = 'A' + 10;
		
		int int1 = 122;
		int int2 = 'r' - 12;
		
		System.out.println("char1 = " + char1 + "  as int: " + (int) char1);
		System.out.println("char2 = " + char2 + "  as int: " + (int) char2);
		System.out.println("char3 = " + char3 + "  as int: " + (int) char3);
		
		System.out.println("int1 = " + int1 + " as char: " + (char) int1);
		System.out.println("int2 = " + int2 + " as char: " + (char) int2);
		
	}

}
