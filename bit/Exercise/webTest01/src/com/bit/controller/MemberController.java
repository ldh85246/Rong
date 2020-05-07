package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@RequestMapping("/listMember.do")
	public ModelAndView listMember() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listMember");
		return mav;
	}
}