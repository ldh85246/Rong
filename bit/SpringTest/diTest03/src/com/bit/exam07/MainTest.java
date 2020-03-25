package com.bit.exam07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.exam07.WriteArticleServiceImpl;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam07/beans.xml");

		WriteArticleServiceImpl ws = (WriteArticleServiceImpl) context.getBean("ws");
		ws.pro();
	}
}
