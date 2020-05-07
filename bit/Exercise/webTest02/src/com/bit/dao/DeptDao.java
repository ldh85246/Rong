package com.bit.dao;

import org.springframework.stereotype.Repository;

import com.bit.db.DBManager;
import com.bit.vo.DeptVo;

@Repository
public class DeptDao {
	public int insertDept(DeptVo d) {
		System.out.println("부서를 등록하였습니다.");
		return DBManager.insertDept(d);
	}
}
