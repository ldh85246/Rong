package com.bit.exam04;

class Person implements Runnable {
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

		(new Thread(p1)).start();
		(new Thread(p2)).start();

//		Thread t1 = new Thread(p1);
//		Thread t2 = new Thread(p2);
//		
//		t1.start();
//		t2.start();
	}
}
