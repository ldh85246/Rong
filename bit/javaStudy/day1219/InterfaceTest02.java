interface A {
	public void pro();
}

interface B {
	public void info();
}

class C implements A, B {
	public void pro() {
		System.out.println("pro");
	}

	public void info() {
		System.out.println("info");
	}
}

class InterfaceTest02 {
	public static void main(String[] args) {
		C c = new C();
		c.pro();
		c.info();
	}
}
