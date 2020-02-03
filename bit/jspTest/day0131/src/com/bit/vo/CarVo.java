package com.bit.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarVo {
	private int car_no;
	private String car_type;
	private String color;
	private int seats;
	private int rent_fee;
	private String fname;
	private int center_no;
	private int t_no;
}
