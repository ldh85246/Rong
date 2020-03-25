package com.bit.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context
		= new AnnotationConfigApplicationContext(SpringConfig.class);
		Person p =(Person) context.getBean("p");
		p.eat("╦фаж");
	}

}
