class SumTest {
	public static void main(String[] args) {
		// int i;
		int a = 0;

		for (int i = 1; i <= 3; i++) {
			a = a + i * i  + 1;
		}
		/*
		1 + 1 = 2
		4 + 1 = 5 7
		9 + 1 = 10 17
		*/
		System.out.println(a); // 17
	}
}
