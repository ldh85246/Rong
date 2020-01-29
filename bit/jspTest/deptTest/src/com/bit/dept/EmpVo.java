package com.bit.dept;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpVo {
	private int eno;
	private String ename;
	private int sal;
	private int dno;
}
