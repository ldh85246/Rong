class SwapTest {
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// a와 b의 저장된 값을 서로 맞바꾸어 보세요.

		int tmp = a;
		a = b;
		b = tmp;

		System.out.println("a = " + tmp);
		System.out.println("b = " + a);
	}
}
