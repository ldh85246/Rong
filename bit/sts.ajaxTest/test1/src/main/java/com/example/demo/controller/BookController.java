package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.BookDao;
import com.example.demo.vo.BookVo;

@Controller
public class BookController {
	
	@Autowired
	private BookDao dao;

	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listBook.do")
	public ModelAndView listBook() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listBook());
		return mav;
	}
	
	@RequestMapping("/detailBook.do")
	public ModelAndView detailBook(int bookid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("b", dao.detail(bookid));
		return mav;
	}
	
	@RequestMapping(value = "/insertBook.do", method = RequestMethod.GET)
	public void insertForm() {
		
	}
	
	@RequestMapping(value = "/insertBook.do", method = RequestMethod.POST)
	public ModelAndView insertBook(BookVo b) {
		ModelAndView mav = new ModelAndView();
		int re = dao.insert(b);
		if (re > 0) {
			mav.setViewName("redirect:/listBook.do");
		}
		return mav;
	}
	
	@RequestMapping("/deleteBook.do")
	public ModelAndView deleteBook(int bookid) {
		ModelAndView mav = new ModelAndView();
		int re = dao.delete(bookid);
		if (re > 0) {
			mav.setViewName("redirect:/listBook.do");
		}
		return mav;
	}
}
