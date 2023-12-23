package videoexamples.classespt1.tostring;

public class Movie {
	
	private String title;
	private long gross;
	private String releaseDate;
	private int theaters;
	
	// Constructor
	public Movie(String title, long gross, int theaters, String releaseDate) {
		super();
		this.title = title;
		this.gross = gross;
		this.releaseDate = releaseDate;
		this.theaters = theaters;
	}

	// Accessors & Mutators
	public String getTitle() { return title; }

	public String getReleaseDate() { return releaseDate; }

	public long getGross() { return gross; }
	public void setGross(long gross) { this.gross = gross; }

	public int getTheaters() { return theaters; }
	public void setTheaters(int theaters) { this.theaters = theaters; }

	@Override
	public String toString() {
		return title;
	}

	
}
