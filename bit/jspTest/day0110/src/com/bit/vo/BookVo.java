package com.bit.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BookVo {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
}
