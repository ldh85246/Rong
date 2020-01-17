class ExceptionTest01 {
	public static void div(int a, int b) {
		try {
			int r = a / b;
			System.out.println(r);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없어요.");
		}
	}
	public static void main(String[] args) {
		div(4, 0);
	}
}
