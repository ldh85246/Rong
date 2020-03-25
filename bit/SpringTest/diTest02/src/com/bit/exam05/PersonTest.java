package com.bit.exam05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam05/beans.xml");
		Person pe = (Person)context.getBean("p");
		pe.eat("»ï°ã»ì");
	}
}
