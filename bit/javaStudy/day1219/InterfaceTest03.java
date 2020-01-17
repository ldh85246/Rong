class Person {
	public void sayHalo() {
		System.out.println("วาทฮ!");
	}
}

interface A {
	public void pro();
}

interface B {
	public void info();
}

class C extends Person implements A, B {
	public void pro() {
		System.out.println("pro");
	}

	public void info() {
		System.out.println("info");
	}
}

class InterfaceTest03 {
	public static void main(String[] args) {
		C c = new C();
		c.pro();
		c.info();
	}
}
