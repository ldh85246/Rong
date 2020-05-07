package test;

public class SuperTest02 {
	public static void main(String[] args) {
//		A ob = new A();
		B ob = new B();
	}
}

class AAAA {
	public AAAA(int i ) {
		
	}

	public AAAA() {
		// TODO Auto-generated constructor stub
	}
}
class BB extends AAAA {
	public BB() {
		super();
		// 해당 라인에서 부모의 매개변수를 갖지 않는 생성자를 요구하지만
		// A클래스에는 디폴트 상자가 
	}
}