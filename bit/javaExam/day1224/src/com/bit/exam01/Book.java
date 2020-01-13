package com.bit.exam01;

public class Book {
	private int no;
	private String title;
	private String writer;
	private int price;
	private String publisher;
	
	public Book(int no, String title, String writer, int price, String publisher) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
