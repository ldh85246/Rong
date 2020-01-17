abstract class Bird {
	public abstract void sound();
}

class Dove extends Bird {
	public void sound() {
		System.out.println("coo coo");
	}
}

class BirdTest {
	public static void main(String[] args) {
		/*
		Bird b = new Bird();
		Bird b = new Dove();
		b.sound();

		Bird[] b = new Bird[5]; 객체 참조변수를 5개 만드는 문장
		Bird a = new Bird();	객체 자체를 생성하는 문장
		*/
	}
}
