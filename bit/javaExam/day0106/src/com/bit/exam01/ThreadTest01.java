package com.bit.exam01;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public void sayHello() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("¾È³ç, " + name + " " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadTest01 {
	public static void main(String[] args) {
		Person p1 = new Person("È«±æµ¿");
		Person p2 = new Person("ÀÌ¼ø½Å");
		p1.sayHello();
		p2.sayHello();
	}
}