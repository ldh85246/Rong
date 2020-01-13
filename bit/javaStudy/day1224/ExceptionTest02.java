class ExceptionTest02 {
	public static void div(int a, int b) throws ArithmeticException {
		// 메소드를 사용하는 쪽(호출하는 쪽)에서 예외처리가 가능
		int r = a / b;
		System.out.println("결과 : " + r);
	}

	public static void main(String[] args) {
		try {
			div(4, 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수는 없어요.");
		}
	}
}
