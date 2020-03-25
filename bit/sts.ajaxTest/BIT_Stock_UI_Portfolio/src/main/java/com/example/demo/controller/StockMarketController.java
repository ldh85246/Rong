package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StockMarketDao;
import com.example.demo.vo.MemberVo;
import com.example.demo.vo.StockVo;
import com.google.gson.Gson;

@RestController
public class StockMarketController {

	@Autowired
	private StockMarketDao dao;

	public void setDao(StockMarketDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/signIn", produces = "application/json; charset=UTF-8")
	public String signIn(String mem_id) {
		String str = "";
		MemberVo m = dao.signIn(mem_id);
		Gson gson = new Gson();
		str = gson.toJson(m);
		return str;
	}
	
	@RequestMapping(value = "/listStock", produces = "application/json; charset=UTF-8")
	public String listStock() {
		String str = "";
		List<StockVo> list = dao.listStock();
		Gson gson = new Gson();
		str = gson.toJson(list);
		return str;
	}
	
	@RequestMapping(value = "/detailStock", produces = "application/json; charset=UTF-8")
	public String detailStock(int stock_no) {
		String str = "";
		StockVo s = dao.detailStock(stock_no);
		Gson gson = new Gson();
		str = gson.toJson(s);
		return str;
	}
}
