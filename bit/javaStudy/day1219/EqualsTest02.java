class Person {
	private String name;
	private int age;

	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if (name.equals(p.name) && age == p.age) {
			return true;
		}
		else {
			return false;
		}
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ", " + age + "살";
	}
}

class EqualsTest02 {
	public static void main(String[] args) {
		Person p1 = new Person("최영수", 20);
		Person p2 = new Person("최영수", 20);

		System.out.println(p1);
		System.out.println(p2);

		if (p1.equals(p2)) {
			System.out.println("같아 ㅇㅇ");
		}
		else {
			System.out.println("달라 ㅠㅠ");
		}
	}
}
