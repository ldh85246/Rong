package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BookDao;
import com.bit.vo.BookVo;

@Controller
public class BookController {

	@Autowired
	private BookDao dao;

	public void setDao(BookDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listBook.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll());
		return mav;
	}

	@RequestMapping("/detailBook.do")
	public ModelAndView detail(int bookid) {
		System.out.println("도서번호:" + bookid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("b", dao.getBook(bookid));
		return mav;
	}

	@RequestMapping(value = "/insertBook.do", method = RequestMethod.GET)
	public void insertForm() {
	}

	@RequestMapping(value = "/insertBook.do", method = RequestMethod.POST)
	public ModelAndView insertSumbmit(BookVo b) {
		ModelAndView mav = new ModelAndView("redirect:/listBook.do");
		int re = dao.insertBook(b);
		if (re <= 0) {
			mav.addObject("msg", "도서등록에 실패하였습니다.");
		}
		return mav;
	}

	@RequestMapping(value = "/updateBook.do", method = RequestMethod.GET)
	public ModelAndView updateForm(int bookid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("b", dao.getBook(bookid));
		return mav;
	}

	@RequestMapping(value = "/updateBook.do", method = RequestMethod.POST)
	public ModelAndView updateSumbmit(BookVo b) {
		ModelAndView mav = new ModelAndView("redirect:/listBook.do");
		int re = dao.updateBook(b);
		if (re <= 0) {
			mav.addObject("msg", "도서수정에 실패하였습니다.");
		}
		return mav;
	}

	@RequestMapping("/deleteBook.do")
	public ModelAndView delete(int bookid) {
		ModelAndView mav = new ModelAndView();
		int re = dao.deleteBook(bookid);
		mav.setViewName("redirect:/listBook.do");
		if (re <= 0) {
			mav.addObject("msg", "도서삭제에 실패하였습니다.");
		}
		return mav;
	}
}