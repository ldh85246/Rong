package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.CartVo;

@RestController
public class CartController {
	
	@RequestMapping("/insertCart")
	public String insertCart(CartVo cart) {
		String str = "ok";
		DBManager.insertCart(cart);
		return str;
	}
}
