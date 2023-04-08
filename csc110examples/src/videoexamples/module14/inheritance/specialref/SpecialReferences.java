package videoexamples.module14.inheritance.specialref;

public class SpecialReferences {

	public static void main(String args[]) {
		
		ParentClass parentObject = new ParentClass(1);
		ChildClass childObject = new ChildClass(2);
		
		System.out.println("ParentClass object: " + parentObject);
		System.out.println("ChildClass object: " + childObject);
		System.out.println();
		
		childObject.setValues("TheParent", "TheChild", 4);
		System.out.println("ChildClass object: " + childObject);
		

	}

}
