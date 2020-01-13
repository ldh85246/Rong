class Human {
	protected String name;
	protected int age;

	public Human() {
	}

	public Human(String name, int age) {
        this.name = name;
        this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + ", " + age;
	}

	public void info() {
		System.out.println(name + ", " + age);
	}
}

class Student extends Human {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String toString() {
		return super.toString() + ", " + major;
	}

	public void info() {
		System.out.println(name + ", " + age + ", " + major);
	}
}

class Hw01_01 {
	public static void main(String[] args) {
		Human h1 = new Human("����", 18);
		Human h2 = new Human("����", 21);
		Human h3 = new Human("���", 50);

		Student s1 = new Student("����", 21, "��ǻ��");
		Student s2 = new Student("����", 22, "�濵");
		Student s3 = new Student("����", 24, "����");

		h1.info();
		h2.info();
		h3.info();
		s1.info();
		s2.info();
		s3.info();
	}
}
