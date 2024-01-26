package extra_crawling.sec03_melon;

public class MelonChart {
	private int rank;
	private String title;
	private String artist;
	private String album;
	private String imgSrc;
	
	public MelonChart(int rank, String title, String artist, String album, String imgSrc) {
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.imgSrc = imgSrc;
	}

	@Override
	public String toString() {
		return String.format("%2d %s   %s   %s   %s", rank, title, artist, album, imgSrc);
//		return "MelonChart [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", imgSrc="
//				+ imgSrc + "]";
	}
	
	
}
