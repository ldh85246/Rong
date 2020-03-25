package com.bit.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.CustomerDao;
import com.bit.vo.CustomerVo;

@Controller
public class CustomerController {

	@Autowired
	private CustomerDao dao;

	// dao의 의존관계를 setter에 의해서 설정하기 위해 setter 메소드 설정
	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	@RequestMapping("/listCustomer.do")
	public ModelAndView listCustomer(String keyword, String searchColumn, String sortColumn, HttpSession session) {
		System.out.println("검색어 : " + keyword);

		// 세션에 담긴 검색어가 우선순위가 높을까요?
		// 새로 검색한 검색어가 우선순위가 높을까요?
		// ===>새로 검색한 검색어가 우선순위가 높아요!!!
		if (keyword == null) {
			keyword = (String) session.getAttribute("keyword");
			searchColumn = (String) session.getAttribute("searchColumn");
		}

		HashMap map = new HashMap();
		map.put("keyword", keyword);
		map.put("searchColumn", searchColumn);
		map.put("sortColumn", sortColumn);

		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll(map)); // addObject로 list 상태유지

		session.setAttribute("searchColumn", searchColumn);
		session.setAttribute("keyword", keyword);

		return mav;
	}

	@RequestMapping("/detailCustomer.do")
	public ModelAndView getCustomer(int custid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("c", dao.getCustomer(custid));
		return mav;
	}

	@RequestMapping(value = "/insertCustomer.do", method = RequestMethod.GET)
	public void insertForm() {
		// 페이지만 호출할 것이기에 추가 내용 필요 없음
	}

	@RequestMapping(value = "/insertCustomer.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(CustomerVo c) { // html 태그의 name과 vo의 변수명이 일치해야 자동적으로 값이 담김
		ModelAndView mav = new ModelAndView(); // jsp:useBean의 파라미터인 setProperty태그에 property="*"와 유사한 동작
		int re = dao.insertCustomer(c);
		if (re > 0) {
			mav.setViewName("redirect:/listCustomer.do");
		} else {
			mav.addObject("msg", "고객등록에 실패하였습니다.");
		}
		return mav;
	}

	@RequestMapping("/deleteCustomer.do")
	public ModelAndView deleteCustomer(int custid, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/listCustomer.do");
		int re = dao.deleteCustomer(custid);
		if (re <= 0) {
			// mav.addObject("msg", "고객삭제에 실패하였습니다.");
			session.setAttribute("msg", "고객삭제에 실패하였습니다.");
		}
		return mav;
	}
}
