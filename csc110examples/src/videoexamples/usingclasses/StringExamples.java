package videoexamples.usingclasses;
// Examples of manipulating strings

public class StringExamples {

	public static void main(String[] args) {
		
		String myStr1 = "Hello";
		String myStr2 = new String("Hello");

	    String str1 = "The sooner you get behind in your work, the more time you have to catch up.";
	    String str2 = "The speed of a non-working program is irrelevant.";
	    String str3 = "---> We have 5 example strings in CSC205! <---";
	    
	    System.out.println("Length of myStr1: " + myStr1.length());
	    System.out.println("Length of myStr2: " + myStr2.length());
	    System.out.println("Length of str1: " + str1.length());
	    System.out.println("Length of str2: " + str2.length());
	    System.out.println("Length of str3: " + str3.length());
	   
	    // String comparison
	    System.out.println();
	    System.out.println("Comparing strings with ==:");
	    if (myStr1 == "Hello") {
	    	System.out.println("  " + myStr1 + " == " + myStr2);
	    }

	    else {
	    	System.out.println("  " + myStr1 + " != " + myStr2);
	    }
	    
	    if (myStr1 == myStr2) {
	    	System.out.println("  " + myStr1 + " == " + myStr2);
	    }

	    else {
	    	System.out.println("  " + myStr1 + " != " + myStr2);
	    }

	    System.out.println("Comparing strings with equals():");
	    if (myStr1.equals(myStr2)) {
	    	System.out.println("  " + myStr1 + " == " + myStr2);
	    }

	    else {
	    	System.out.println("  " + myStr1 + " != " + myStr2);
	    }

	    System.out.println("Comparing strings with compareTo():");
	    if (myStr1.compareTo(myStr2)==0) {
	    	System.out.println("  " + myStr1 + " == " + myStr2);
	    }

	    else {
	    	System.out.println("  " + myStr1 + " != " + myStr2);
	    }
	    System.out.println();

	}

}
