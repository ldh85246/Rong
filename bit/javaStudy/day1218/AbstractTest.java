class A {
	public void pro() {
		System.out.println("A의 프로");
	}

	public void test() {
		System.out.println("test");
	}
}

class B extends A {
	public void pro(){
		System.out.println("B의 프로");
	}
}

class AbstractTest {
	public static void main(String[] args) {
		B ob = new B();
		ob.pro();
		ob.test();
	}
}
