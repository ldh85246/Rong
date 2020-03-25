package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockVo {
	private int stock_no;
	private String stock_name;
	private int stock_price;
	private int stock_max;
	private int stock_min;
}
