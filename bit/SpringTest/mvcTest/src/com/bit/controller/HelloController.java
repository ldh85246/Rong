package com.bit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/listMember.do")
	public ModelAndView listMember() {
		ModelAndView mav = new ModelAndView();
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("김유신");
		list.add("유관순");
		list.add("강감찬");
		
		mav.addObject("list", list);
		mav.setViewName("listMember");
		return mav;
	}
	
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("msg", "안녕하세요");
		mav.addObject("year", 2020);
		return mav;
	}
}
