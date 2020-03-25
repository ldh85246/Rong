package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersVo {
	private int orders_no;
	private int mem_no;
	private int stock_no;
	private int orders_qty;
	private int orders_tot;
}
