package classexamples.module8classdesign.book;

public class BookDriver {

	public static void main(String[] args) {

		// Create (instantiate) Book objects (instances)
		Book myBook = new Book("Pride and Prejudice", "Jane Austen", "Novel", 448);
		Book yourBook = new Book("Starship Troopers", "Robert A. Heinlein", "Novel", 299);
		
		// Use the methods ("drive" the class)
		System.out.println("myBook: " + myBook); // this uses the toString method
		myBook.printInfo();
		myBook.read();
		
		System.out.println();
		System.out.println("yourBook: " + yourBook); // this uses the toString method
		yourBook.printInfo();
		yourBook.read();
	}

}
