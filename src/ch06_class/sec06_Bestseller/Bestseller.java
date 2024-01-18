package ch06_class.sec06_Bestseller;

public class Bestseller {
	private int rank;
	private String title;
	private String autjor;
	private String translator;
	private String company;
	private String price;
	
	public Bestseller () {}
	public Bestseller(int rank, String title, String autjor, String translator, String company, String price) {
		super();
		this.rank = rank;
		this.title = title;
		this.autjor = autjor;
		this.translator = translator;
		this.company = company;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bestseller [rank=" + rank + ", title=" + title + ", autjor=" + autjor + ", translator=" + translator
				+ ", company=" + company + ", price=" + price + "]";
	}
	



}
