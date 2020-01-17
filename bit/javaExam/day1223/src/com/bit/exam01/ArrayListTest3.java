package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", 20));
		list.add(new Person("이순신", 40));
		list.add(new Person("유관순", 30));
		
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			System.out.println(p);
			p.sayHello();
		}
	}
}
