package videoexamples.classespt1.pen;

public class PenDriver {
	
	public static void main(String[] args) {
		FourColorPen myPen = new FourColorPen();
		FourColorPen pen2 = new FourColorPen();
		
		System.out.println("After instantiating:");
		System.out.println("  myPen: " + myPen);
		System.out.println("  pen2: " + pen2);
		System.out.println();
		
		// Initial color is NONE, so nothing should write
		myPen.write("You shouldn't see this");
		pen2.write("You shouldn't see this, either!");
		
		myPen.click("blue");
		myPen.write("Hello, world!");
		
		pen2.click("GrEeN");
		pen2.write("The end!");

		myPen.click("RED");
		myPen.write("Goodbye!");
		
		System.out.println();
		System.out.println("End of main:");
		System.out.println("  myPen: " + myPen);
		System.out.println("  pen2: " + pen2);
		
	}

}
