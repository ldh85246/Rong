package test;

public class HumanTest {

	public static void main(String[] args) {
//		Human h1 = new Human("홍길동", 20);
//		System.out.println(h1);
		
//		Students st = new Students("홍길동", 20, "체육교육과");
//		System.out.println(st);
		
		Students s = new Students();
		System.out.println(s);
	}
}

class Human {
	String name;
	int age;
	
	public Human() {
		
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}

class Students extends Human {

	String major;
	
	public Students(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public Students() {
		
	}

	public String toString() {
		return super.toString() + ", 학과 : " + major;
	}
}