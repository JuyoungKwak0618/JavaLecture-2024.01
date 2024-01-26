package extra_crawling.sec02_Interpark_book;

public class InterparkBook {
		private int rank;
		private String title;
		private String author;
		private String company;
		private int price;
		
		public InterparkBook(int rank, String title, String author, String company, int price) {
			
			this.rank = rank;
			this.title = title;
			this.author = author;
			this.company = company;
			this.price = price;
		}

		@Override
		public String toString() {
			return String.format("%2d %s   %s   %s   %,d", rank, title, author, company, price);
//			return "InterparkBook [rank=" + rank + ", title=" + title + ", author=" + author + ", company=" + company
//				+ ", price=" + price + "]";
		}
		
		
		
	
	
		
}
