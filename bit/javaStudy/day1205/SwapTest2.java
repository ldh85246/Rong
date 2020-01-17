class SwapTest2 {
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = a ^ b;
		b = b ^ a;
		a = a ^ b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
