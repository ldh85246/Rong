package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookDao;
import com.example.demo.vo.BookVo;
import com.google.gson.Gson;

@RestController
public class BookController {
	
	@Autowired
	private BookDao dao;
	
	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/listBook.do", produces = "application/json; charset=UTF-8")
	public String list() {
		String str = "";
		List<BookVo> list = dao.listAll();	// list는 view에서 지원해주지 않기 때문에 list를 Gson을 통해 JSON 형태로 변환시켜줘야 함
		Gson gson = new Gson();
		str = gson.toJson(list);			// 문자열이나 list 등의 자바형태를 String으로 반환해줌
		return str;
	}
	
	@RequestMapping("/insertBook")
	public String insert(BookVo b) {
		String str = "ok";
		dao.insert(b);
		return str;
	}
	
	@RequestMapping("/updateBook")
	public String update(BookVo b) {
		String str = "ok";
		dao.update(b);
		return str;
	}
	
	@RequestMapping("/deleteBook")
	public String delete(BookVo b) {
		String str = "ok";
		dao.delete(b);
		return str;
	}
}
