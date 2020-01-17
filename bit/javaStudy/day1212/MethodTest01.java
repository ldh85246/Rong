class MethodTest01 {

	// 메소드의 정의
	public static void sayHello() {// 메소드를 생성하기 위해서는 반드시 (){}가 와야 한다.
		for (int i = 1; i <= 3; i++) {
			System.out.println("영수야, 안녕");
		}
	}

	public static void main(String[] args) {

		sayHello(); // 메소드의 호출

		System.out.println("오늘은 목요일입니다.");

		sayHello();

		int year = 2019;
		System.out.println(year);

		sayHello();
	}
}
