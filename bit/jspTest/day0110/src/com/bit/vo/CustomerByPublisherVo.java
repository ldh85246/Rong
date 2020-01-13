package com.bit.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class CustomerByPublisherVo {
	private int custid;
	private String name;
	private String bookname;
	private int saleprice;
}
