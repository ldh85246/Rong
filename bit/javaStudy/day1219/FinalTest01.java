class Person {
	String name;
	int age;
	final String addr = "서울시 마포구 신수동";

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ", " + age + ", " + addr; 
	}
}

class FinalTest01 {
	public static void main(String[] args) {
		Person p1 = new Person("이수인", 20);
		System.out.println(p1);

		p1.name = "이수지";
		p1.age = 22;
		// p1.addr = "제주시 서귀포시 애월읍";	
		// final 변수는 값을 변경할 수 없음
		// 변수지만 상수처럼 사용하고자 할 때 사용함
		System.out.println(p1);
	}
}
