package com.bit.exam02;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public void sayHello() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("¾È³ç, " + name + " " + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("È«±æµ¿");
		Person p2 = new Person("À¯°ü¼ø");
		p1.sayHello();
		p2.sayHello();
	}
}
