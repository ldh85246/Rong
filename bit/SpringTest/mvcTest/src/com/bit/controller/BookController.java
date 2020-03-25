package com.bit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BookDao;
import com.bit.vo.BookVo;

@Controller
public class BookController {
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@RequestMapping("/listBook.do")
	public ModelAndView listBook() {
		ModelAndView mav = new ModelAndView();
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		list = bookDao.listAll();
		mav.setViewName("listBook");
		mav.addObject("list", list);
//		mav.addObject("list", dao.listAll());
		return mav;
	}
}
