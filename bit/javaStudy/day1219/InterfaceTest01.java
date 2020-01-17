abstract class A {
	abstract public void pro();
}

interface B {
	public void info();
}

class C extends A, implements B {
	public void pro() {
		System.out.println("pro");
	}

	public void info() {
		System.out.println("info");
	}
}

class InterfaceTest01 {
	public static void main(String[] args) {
		C ob = new C();
		c.pro();
		c.info();
	}
}
