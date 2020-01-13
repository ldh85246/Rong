class Test01 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 10; i <= 30; i++) {	// 21
			for (int j = 0; j <= 5; j++) {	// 6
				sum += (i * j);				// 21 * 6
			}
		}
		System.out.println(sum);
	}
}
