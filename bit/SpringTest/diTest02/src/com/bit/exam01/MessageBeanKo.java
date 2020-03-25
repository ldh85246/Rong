package com.bit.exam01;

public class MessageBeanKo implements MessageBean {
	
	// MessageBeanKo에 기본생성자를 만들고
	// 간단한 출력문을작성하여 동작하는지 확인해봅니다.
	public MessageBeanKo() {
		// TODO Auto-generated constructor stub
		System.out.println("생성자 동작");
	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요, " + name);
	}

}
