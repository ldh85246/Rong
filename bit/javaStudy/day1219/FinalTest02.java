class Person {
	public void sayHalo() {
		System.out.println("할로!");
	}
}

class Student extends Person {
	public void sayHalo() {
		System.out.println("잘 지내니?");
	}
}

class FinalTest02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.sayHalo();
	}
}
