package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDao;
import com.bit.vo.CustomerVo;

@Controller
public class UpdateCustomerController {

	@Autowired
	private CustomerDao dao;

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/updateCustomer.do", method = RequestMethod.GET)
	public ModelAndView form(int custid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.getCustomer(custid));
		return mav;
	}

	@RequestMapping(value = "/updateCustomer.do", method = RequestMethod.POST)
	public ModelAndView sumbit(CustomerVo c) {
		ModelAndView mav = new ModelAndView();
		int re = dao.updateCustomer(c);
		if (re > 0) {
			mav.setViewName("redirect:/listCustomer.do");
		} else {
			mav.addObject("msg", "고객수정에 실패하였습니다.");
		}
		return mav;
	}
}
