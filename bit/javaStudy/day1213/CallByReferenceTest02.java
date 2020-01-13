// 새로운 자료형을 만든 것
class Person {
	String name;
	int age;
}

class CallByReferenceTest02 {
	// 클래스 Person을 매개변수로 전달받아 나이를 1 증가하는 메소드를 정의
	public static void plus(Person p) {
		p.age += 1;
	}

	public static void main(String[] args) {
		Person suin/*suin = 객체참조변수*/ = new Person();
		suin.name = "이수인";
		suin.age = 20;
		plus(suin);
		System.out.println(suin.name);
		System.out.println(suin.age);
	}
}
