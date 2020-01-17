class Hw_6_2_1 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 10;
		while (i <= 30) {
			int j = 0;
			while (j <= 5) {
				sum += i * j;
				j++;
			}
			i++;
		}
		System.out.println(sum);
	}
}
