package labs.exceptions;

public class NullPtrExample {

	public static void charsOfString(String str) {
		int len = str.length();
		
		for(int index=0;index<len;index++) {
			System.out.print("[" + str.charAt(index) + "]");
		}
		System.out.println();
	}

    public static void main(String[] args) {
        String str1 = "First String";  
        String str2 = null;   // intentionally not initialized
        String str3 = "Last String";
        
        charsOfString(str1);
        charsOfString(str2);
        charsOfString(str3);
    }

}
