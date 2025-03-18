package classexamples.module8classdesign.book;

public class Book {

	// Attributes
	String title;
	String author;
	String genre;
	int pages;

	// Constructor
	public Book(String title, String author, String genre, int pages) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pages = pages;
	}

	// Method to read the book
	public void read() {
		System.out.println("Reading the book: " + title);
	}

	// Method to get the book information
	public void getInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Genre: " + genre);
		System.out.println("Pages: " + pages);
	}
}
