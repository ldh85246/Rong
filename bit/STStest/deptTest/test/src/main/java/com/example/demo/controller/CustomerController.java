package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.CustomerDao;
import com.example.demo.vo.CustomerVo;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerDao dao;

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/insertCustomer.do", method = RequestMethod.GET)
	public void insertForm() {
		
	}
	
	@RequestMapping(value = "/insertCustomer.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(CustomerVo c) {
		ModelAndView mav = new ModelAndView();
		int re = dao.insertCustomer(c);
		if(re > 0) {
			mav.setViewName("redirect:/listCustomer.do");
		} else {
			mav.addObject("msg", "고객 등록에 실패하였습니다.");
		}
		return mav;
	}
	
	@RequestMapping(value = "/updateCustomer.do", method = RequestMethod.GET)
	public ModelAndView form(int custid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.getCustomer(custid));
		return mav;
	}
	
	@RequestMapping(value = "/updateCustomer.do", method = RequestMethod.POST)
	public ModelAndView submit(CustomerVo c) {
		ModelAndView mav = new ModelAndView();
		int re = -1;
		re = dao.updateCustomer(c);
		if(re > 0) {
			mav.setViewName("redirect:/listCustomer.do");
		}
		return mav;
	}
	
	@RequestMapping("/deleteCustomer.do")
	public ModelAndView deleteCustomer(int custid) {
		ModelAndView mav = new ModelAndView();
		int re = dao.deleteCustomer(custid);
		if(re > 0) {
			mav.setViewName("redirect:/listCustomer.do");
		} else {
			mav.addObject("msg", "고객삭제에 실패하였습니다.");
		}
		return mav;
	}
	
	@RequestMapping("/detailCustomer.do")
	public ModelAndView getCustomer(int custid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.getCustomer(custid));
		return mav;
	}
	
	@RequestMapping("/listCustomer.do")
	public ModelAndView listCustomer() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll());
		return mav;
	}
}
