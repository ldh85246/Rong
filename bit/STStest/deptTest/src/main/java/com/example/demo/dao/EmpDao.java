package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.EmpManager;
import com.example.demo.vo.EmpViewVo;
import com.example.demo.vo.EmpVo;

@Repository
public class EmpDao {
	public int insertEmp(EmpVo e) {
		return EmpManager.insert(e);
	}
	
	public List<EmpVo> managerList() {
		return EmpManager.managerList();
	}
	
	public List<EmpViewVo> listEmpView(HashMap map){
        return EmpManager.listEmpView(map);
    }
}
