class CallByValueTest {
	// 매개변수 n을 전달받아 n의 값을 1 증가하여 출력하는 메소드를 정의
	public static void plus(int n) {
		n += 1;
	}

	public static void main(String[] args) {
		int n = 31;
		plus(n);
		System.out.println(n);
	}
}
