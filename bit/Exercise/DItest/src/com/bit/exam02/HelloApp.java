package com.bit.exam02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		MessageBean mb = (MessageBean)new ClassPathXmlApplicationContext("com/bit/exam02/beans.xml").getBean("mb");
		mb.sayHello("tiger");
	}
}
