class Big {
	public static void main(String[] args) {
		int []a = {1, 2, 3};
		bigArr(a);
	}

	public static void bigArr(int []a) {
		int big = a[0];

		for (int i = 0; i < a.length; i++) {
			if (big < a[i]) {
				big = a[i];
			}
		}
		System.out.println(big);
	}
}
