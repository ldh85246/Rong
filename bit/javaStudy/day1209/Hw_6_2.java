class Hw_6_2 {
	public static void main(String[] args) {

		int i, j;
		int sum = 0;

		for (i = 10; i <= 30; i++) {
			for (j = 0; j <= 5; j++) {
				sum += i * j;
			}
		}
		System.out.println(sum);

		int sum1 = 0;
		int i1 = 10;
		while (i1 <= 30) {
			int j1 = 0;
			while (j1 <= 5) {
				sum1 += i1 * j1;
				j1++;
			}
			i1++;
		}
		System.out.println(sum1);
	}
}
