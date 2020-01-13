package com.bit.exam03;

class Person extends Thread {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public void run() {
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
		p1.start();
		p2.start();
	}
}
