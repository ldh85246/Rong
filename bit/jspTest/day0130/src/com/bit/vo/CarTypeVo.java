package com.bit.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarTypeVo {
	private int t_no;
	private String t_name;
	private double rent_rate;
}
