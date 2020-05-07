package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.dao.DeptDao;
import com.bit.vo.DeptVo;

@Controller
public class DeptController {

	@Autowired
	private DeptDao dao;

	public void setDao(DeptDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/insertDept.do")
	public void insertForm() {
	}

	@RequestMapping("/insertDeptOk.do")
	public void insertSumbit(DeptVo d) {
		dao.insertDept(d);
	}

}
