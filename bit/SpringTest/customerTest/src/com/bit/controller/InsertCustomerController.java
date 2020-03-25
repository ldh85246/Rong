package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDao;
import com.bit.vo.CustomerVo;

@Controller
public class InsertCustomerController {

	@Autowired
	private CustomerDao dao;

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/insertCustomer.do", method = RequestMethod.GET)
	public void form() {
	}

	@RequestMapping(value = "/insertCustomer.do", method = RequestMethod.POST)
	public ModelAndView submit(CustomerVo c) {
		ModelAndView mav = new ModelAndView();
		int re = dao.insertCustomer(c);
		if (re > 0) {
			mav.setViewName("redirect:/listCustomer.do");
		} else {
			mav.addObject("msg", "고객등록에 실패하였습니다.");
		}
		return mav;
	}
}
