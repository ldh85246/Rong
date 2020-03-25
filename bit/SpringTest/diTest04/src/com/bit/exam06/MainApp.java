package com.bit.exam06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context
		= new AnnotationConfigApplicationContext(SpringConfig.class);
		WriteArticleServiceImpl ws  = (WriteArticleServiceImpl)context.getBean("ws");
		ws.pro();
	}
}
