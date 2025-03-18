package classexamples.module8classdesign.book;

public class BookDriver {

	public static void main(String[] args) {
		// Create a Book object
		Book myBook = new Book("Pride and Prejudice", "Jane Austen", "Novel", 448);
		Book yourBook = new Book("Starship Troopers", "Robert A. Heinlein", "Novel", 299);

		// Use the methods
		System.out.println("my book:");
		myBook.read();
		myBook.getInfo();
		
		System.out.println();
		System.out.println("Your book:");
		yourBook.read();
		yourBook.getInfo();
	}
}
