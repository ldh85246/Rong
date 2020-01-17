package com.bit.exam02;

class Person implements Runnable {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("안녕, " + name + " " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadTest02 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("이순신");
//      p1.start();
//      p2.start();
//      p1.run();      //쓰레드 가동이 아니고 run메소드를 일반 메소드처럼 취급
//      p2.run();
//      1. 객체를 생성해서 사용      
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		t1.start();
		t2.start();
//      2. 객체 생성 없이 바로 사용      
		(new Thread(p1)).start();
		(new Thread(p2)).start();
	}
}