package ch06_class.sec05_Melonchart;

public class Melonchart {
	
	private int rank;
	private String title;
	private String artist;
	private String album;
	private String like;
	
	public Melonchart( ) { }
	public Melonchart(int rank, String title, String artist, String album, String like) {
		super();
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.like = like;
	}
	@Override
	public String toString() {
		return "Melonchart [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", like="
				+ like + "]";
	}
	
	
	
	
	
}
	
