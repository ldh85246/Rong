package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.GoodsDao;
import com.google.gson.Gson;

@Controller
public class GoodsController {

	@Autowired
	private GoodsDao dao;

	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/goodsTest.do")
	public void goodsTest() {
		System.out.println("컨트롤러 동작함");
	}

	// view에서 listGoods.do를 요청하고, view에서 사용할 data를 json타입으로 객체화 시켜준다.
	@RequestMapping(value = "/listGoods.do", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public String listGoods() {
		String str = "";
		Gson gson = new Gson();
		str = gson.toJson(dao.listAll());
		return str;
	}
}
