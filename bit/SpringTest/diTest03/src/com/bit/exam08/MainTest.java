package com.bit.exam08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam08/beans.xml");
		
		Person p1 = (Person)context.getBean("p");
		Person p2 = (Person)context.getBean("p");
		
		if (p1 == p2) {
			System.out.println("같아요"); // 디폴트는 singleton
		} else {
			System.out.println("달라요"); // prototype으로 변경 가능, bean을 사용할 때마다
		}
		
		// TODO Auto-generated method stub
//		System.out.println("1");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam08/beans.xml");
//		// 파일을 불러들일 때 객체가 생성된다.
//		
//		System.out.println("2");
//		Person pe = (Person)context.getBean("p");
//		System.out.println("3");
//		pe.info();
	}
}
