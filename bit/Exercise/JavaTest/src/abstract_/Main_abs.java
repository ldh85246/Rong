package abstract_;

public class Main_abs {

	public static void main(String[] args) {

		AbstractClassEx ex = new ClassEx(10, "java");
		ex.fun1();
		ex.fun2();
		
		AbstractClassEx ex1 = new ClassEx();
		// 객체로 생성해줘야 AbstractClassEx클래스를 상속받은
		// ClassEx의 기본생성자를 호출할 수 있다.
	}

}
