package com.bit.vo;

public class GoodsVo {
	private int no;
	private String item;
	private int qty;
	private int price;
	private String fname;
	private String detail;
	
	public GoodsVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsVo(int no, String item, int qty, int price, String fname, String detail) {
		super();
		this.no = no;
		this.item = item;
		this.qty = qty;
		this.price = price;
		this.fname = fname;
		this.detail = detail;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
