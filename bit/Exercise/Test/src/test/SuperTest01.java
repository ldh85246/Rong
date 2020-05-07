package test;

public class SuperTest01 {
	public static void main(String[] args) {
		B ob = new B();
//		System.out.println(ob.year);
//		System.out.println(ob.super.year);
		ob.pro();
	}
}

class AAA {
	int year = 2019;

	public void info() {
		System.out.println("A");
	}
}

class B extends AAA {
	int year = 2020;

	public void info() {
		System.out.println("B");
		info();
		super.info();
	}

	public void pro() {
		System.out.println(year);
		System.out.println(super.year);
	}
}
