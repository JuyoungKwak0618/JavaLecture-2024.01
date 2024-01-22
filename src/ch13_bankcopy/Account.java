package ch13_bankcopy;

public class Account {
	private String ano;
	private String person;
	private int price;
	
	
	public Account(String ano, String person, int price) {
		this.ano = ano;
		this.person = person;
		this.price = price;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getPerson() {
		return person;
	}


	public void setPerson(String person) {
		this.person = person;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
}
