package com.bit.exam01;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] arr = new int[5]; // 기본자료형 배열, 자료형이 한정되어 있음
		
		ArrayList list = new ArrayList(); // 다양한 자료형을 담을 수 있음
		list.add("귤");
		list.add(28);
		list.add(new Person("홍길동", 20));
		list.add(new Person("이순신", 40));
		list.add(true);		
		list.add(5.8);
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i); // Object라는 변수를 만들어 list에 있는 데이터를 하나씩 꺼내서 obj에 넣는다.
			System.out.println(obj);
			if (obj instanceof Person) {
				((Person)obj).sayHello();
			}
		}
	}
}
