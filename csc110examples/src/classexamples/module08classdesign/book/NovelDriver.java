package classexamples.module08classdesign.book;

public class NovelDriver {

	public static void main(String[] args) {

		// Create (instantiate) 2 Book objects (instances)
		Novel myNovel = new Novel("Pride and Prejudice", "Jane Austen", "Romance", 1813);
		Novel yourNovel = new Novel("Starship Troopers", "Robert Heinlein", "Science Fiction", 1959);
		
		// Use methods ("drive" the class)
		System.out.println("I'm reading " + myNovel);
		myNovel.printInfo();
		myNovel.read();
		System.out.println();
		
		System.out.println("I'm reading " + yourNovel);
		yourNovel.printInfo();
		yourNovel.read();
	}

}
