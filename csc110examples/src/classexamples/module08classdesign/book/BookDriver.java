package classexamples.module08classdesign.book;

public class BookDriver {

	public static void main(String[] args) {

		// Create (instantiate) Book objects (instances)
		Book myBook = new Book("Pride and Prejudice", "Jane Austen", "Novel", 448);
		Book yourBook = new Book("Starship Troopers", "Robert A. Heinlein", "Novel", 299);
		
		// Use the methods ("drive" the class)
		System.out.println("myBook: " + myBook);    // this uses the toString method
		myBook.printInfo();
		myBook.read();
		
	}

}
