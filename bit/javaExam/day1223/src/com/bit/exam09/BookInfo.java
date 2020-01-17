package com.bit.exam09;

public class BookInfo {
	private String number;
	private String title;
	private String author;
	private String price;
	private String publisher;
	
	public BookInfo(String number, String title, String author, String price, String publisher) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
