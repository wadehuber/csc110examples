package classexamples.module08classdesign.book;

public class Novel {
	
	private String title;
	private String author;
	private String genre;
	private int date;
	
	public Novel(String title, String author, String genre, int date) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.date = date;
	}

	public void printInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Genre: " + genre);
		System.out.println("Date: " + date);
	}

	public void read() {
		System.out.println("Reading " + this);
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public int getDate() {
		return date;
	}

	@Override
	public String toString() {
		return title + " by " + author;
	}

	

}
