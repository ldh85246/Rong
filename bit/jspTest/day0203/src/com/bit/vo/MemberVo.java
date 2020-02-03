package com.bit.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberVo {
	private String id;
	private String pwd;
	private String name;
	private String tel;
	private String birth;
	private String email;
	private String gender;
	private String bloodtype;
	private String hobby;
	private String url;
	private String job;
	private String intro;
}
