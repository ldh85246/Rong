class ReturnMethodTest02 {
	public static int plus(int a, int b) { /* void = 리턴 값이 없다는 뜻 */
		int r = a + b;
		return r;
	}
	public static void main(String[] args) {
		int r = plus(2, 3);
		System.out.println("결과 : " + r);
	}
}
