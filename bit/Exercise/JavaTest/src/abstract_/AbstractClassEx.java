package abstract_;

public abstract class AbstractClassEx { // 추상 클래스
	// 멤버변수
	int num;
	String str;
	// 생성자
	public AbstractClassEx() {
		System.out.println("AbstractClassEx Constructor");
	}
	public AbstractClassEx(int i, String s) {
		System.out.println("AbstractClassEx Constructor");
		this.num = i;
		this.str = s;
	}
	// 메소드
	public void fun1() {
		System.out.println("-- fun1() START --");
	}
	// 추상 메소드
	public abstract void fun2();
}
