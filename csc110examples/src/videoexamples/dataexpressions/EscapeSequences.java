package videoexamples.dataexpressions;

public class EscapeSequences {

	public static void main(String[] args) {
		// System.out.println("Try saying "Alexa, do my homework"!");
		System.out.println("Try saying \"Alexa, do my homework\"!");
		System.out.println("Double quote \" & single quote \'");
		
		System.out.println("[Test of a \t tab (\\t)]");
		System.out.println("[Test of a \n newline (\\n)]");
		
		int num1 = 9^2 ;
		int num2 = (9^2);
		System.out.println("Value1 = " + num1);
		System.out.println("Value2 = " + num2);

	}

}
