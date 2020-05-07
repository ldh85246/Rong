package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@RequestMapping("/insert.do")
	public String insert() {
		ModelAndView mav = new ModelAndView();
		return "insert";
	}

	@RequestMapping("/list.do")
	public String list(Model model) {
		System.out.println("컨트롤러 동작함");
		ModelAndView mav = new ModelAndView();
		model.addAttribute("msg", "게시물 목록");
		return "list";
	}
	
}