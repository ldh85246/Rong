package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.MemberVo;
import com.example.demo.vo.StockVo;

@Repository
public class StockMarketDao {
	
	public MemberVo signIn(String mem_id) {
		return DBManager.signIn(mem_id);
	}
	
	public List<StockVo> listStock() {
		return DBManager.listStock();
	}
	
	public StockVo detailStock(int stock_no) {
		return DBManager.detailStock(stock_no);
	}
}
