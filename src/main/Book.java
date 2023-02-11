package main;

public class Book {
	private String title;
	private double price;
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	
	public String getBookInfo() {
		return this.title+"-"+this.price;
	}

}
