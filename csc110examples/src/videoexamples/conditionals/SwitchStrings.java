package videoexamples.conditionals;

import java.util.Scanner;

public class SwitchStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a class: ");
		String course = scan.next();
		
		switch(course.toLowerCase()) {
		case("csc110"):
			System.out.println("Introduction to Computer Science");
			break;
		case("csc120"):
			System.out.println("Digital Design Fundamentals");
			break;
		case("csc205"):
			System.out.println("Object Oriented Programming and Data Structures");
			break;
		case("csc230"):
			System.out.println("Computer Organization and Assembly Language");
			break;
		case("csc240"):
			System.out.println("Introduction to Different Programming Languages");
			break;
		default:
			System.out.println("Unknown class");
		}

	}

}
