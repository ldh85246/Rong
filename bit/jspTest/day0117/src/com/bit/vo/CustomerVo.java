package com.bit.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CustomerVo {
	private int custid;
	private String name;
	private String address;
	private String phone;
}
