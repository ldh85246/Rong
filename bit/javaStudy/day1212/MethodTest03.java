class MethodTest03 {

	// 메소드의 정의
	public static void sayHello(String ireum, int n // 매개 변수) {// 메소드를 생성하기 위해서는 반드시 (){}가 와야 한다.
		for (int i = 1; i <= n; i++) {
			System.out.println(ireum + "야(아), 안녕");
		}
	}

	public static void main(String[] args) {

		sayHello("원우", 2); // 메소드의 호출시에 메소드의 괄호 안에 있는 언어를 인수라고 표현한다.

		System.out.println("오늘은 목요일입니다.");

		sayHello("수인", 10);

		int year = 2019;
		System.out.println(year);

		sayHello("영수", 5);
	}
}
