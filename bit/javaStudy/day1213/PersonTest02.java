class Person {
	private String name;
	private String gender;
	private int age; // 멤버변수들한테는 일반적으로 외부로부터의 보호를 목적으로 private을 사용한다

	public void setName(String n) {
		name = n;
	}

	public void setGender(String g) {
		gender = g;
	}

	public void setAge(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void eat(String food) {
		System.out.println(gender+ ", " + age + "살 " + name + "이(가)" + food + "을(를) 먹어요");
	}

	public void sleep() {
		System.out.println(name + "이(가) 쿨쿨 자요.");
	}
}

class  PersonTest02 {
	public static void main(String[] args) {
		Person p = new Person();
		// p.name = "최영수";
		p.setName("최영수");
		p.setGender("남자");
		p.setAge(20);
		p.eat("맥주");
		p.sleep();
		// System.out.println(p.name);
		// System.out.println(p.getName());

		/* p.age = 28;
		p.gender = "남자";
		p.eat("피자");
		p.sleep(); */
	}
}
