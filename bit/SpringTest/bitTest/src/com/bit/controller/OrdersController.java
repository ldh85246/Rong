package com.bit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BookDao;
import com.bit.dao.CustomerDao;
import com.bit.dao.OrdersDao;
import com.bit.vo.OrdersVo;

@Controller
public class OrdersController {

	@Autowired
	private OrdersDao Odao;

	@Autowired
	private BookDao bDao;

	@Autowired
	private CustomerDao cDao;

	public void setOdao(OrdersDao odao) {
		Odao = odao;
	}

	public void setbDao(BookDao bDao) {
		this.bDao = bDao;
	}

	public void setcDao(CustomerDao cDao) {
		this.cDao = cDao;
	}

	@RequestMapping(value = "/insertOrder.do", method = RequestMethod.GET)
	public ModelAndView insertForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("cList", cDao.listAll(null));
		mav.addObject("bList", bDao.listAll());
		return mav;
	}

	@RequestMapping(value = "/insertOrder.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(OrdersVo o) {
		ModelAndView mav = new ModelAndView();
		int re = Odao.insertOrders(o);
		mav.addObject("re", re);
		return mav;
	}
}