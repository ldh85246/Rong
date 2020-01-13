class PersonTest02 {
	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		p.info();
	}
}

class Person {
	private String name;
	private int age;
	
	public void info(){
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}
}