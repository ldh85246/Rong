package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.DeptDao;
import com.example.demo.dao.EmpDao;
import com.example.demo.vo.EmpVo;

@Controller
public class EmpController {
	
	@Autowired
	private DeptDao ddao;
	
	@Autowired
	private EmpDao edao;

	public void setDdao(DeptDao ddao) {
		this.ddao = ddao;
	}

	public void setEdao(EmpDao edao) {
		this.edao = edao;
	}
	
	@RequestMapping(value = "/insertEmp.do", method = RequestMethod.GET)
	public ModelAndView insertForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("dList", ddao.listAll());
		mav.addObject("mlist", edao.managerList());
		return mav;
	}
	
	@RequestMapping(value = "/insertEmp.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(EmpVo e) {
		ModelAndView mav = new ModelAndView();
		int re = edao.insertEmp(e);
		mav.addObject("re", re);
		return mav;
	}
	
	@RequestMapping("/listEmp.do")
    public ModelAndView listEmpView(String searchColumn, String keyword) {
        HashMap map = new HashMap();
        map.put("searchColumn", searchColumn);
        map.put("keyword", keyword);
        ModelAndView mav = new ModelAndView();
        mav.addObject("list", edao.listEmpView(map));
        return mav;
    }
}
