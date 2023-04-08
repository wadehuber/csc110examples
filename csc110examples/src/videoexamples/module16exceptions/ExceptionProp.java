package videoexamples.module16exceptions;

public class ExceptionProp
{

    static public void main (String[] args)
    {
        System.out.println("MAIN BEGIN");
        function1();
        System.out.println("MAIN END");
    }

    public static void function1()
    {
        System.out.println("Function 1 start");
        function2();
        System.out.println("Function 1 end");
     }

    public static void function2()
    {
        System.out.println("  Function 2 start");
        try {
        	function3();
        }
        catch(ArithmeticException excep) {
        	System.err.println();
        	System.out.println("ERROR: An exception occurreed while running function3()");
        	System.err.println("The exception message is: " + excep.getMessage());
        	System.err.println();
        	System.err.println("Call Stack Trace:");
        	excep.printStackTrace();
        	System.err.println();
        }
        System.out.println("  Function 2 end");
    }

    public static void function3()
    {
        System.out.println("    Function 3 start");
        function4 ();
        System.out.println("    Function 3 end");
    }

    public static void function4()
    {
    	int val;

        System.out.println("      Function 4 start");

        System.out.println("      Create an exception");
        val = 10 / 0;                
        System.out.println("val=" + val);
     
        System.out.println("      Function 4 end");
    }
}
