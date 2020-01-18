class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	String major;
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
}

class Test {
	public static void main(String[] args) {
		Person p1 = new Student("�̼���", 20, "��ǻ�� ����");
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		// System.out.println(p1.major);
		System.out.println(((Student)p1).major);
	}
}