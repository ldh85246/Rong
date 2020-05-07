package test;

public class StaticTest {

	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();

		a.name = "이순신";
		b.name = "홍길동";
//		a.addr("서울시");

		System.out.println(a.name + "a.name" + a.addr);
		System.out.println(a.name + "b.name" + b.name + ", " + a.addr);
	}

	static class Person {
		String name;
		int age;
		public static String addr;

		public void info() {
			System.out.println("");
		}
	}
}
