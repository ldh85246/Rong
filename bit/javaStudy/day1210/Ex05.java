class Ex05 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i += 3;
		}

		int x, y;
		for (x = 0; x < 3; x++) {
			for (y = 2; y >= 0; y--) {
				System.out.println("*");
			}
		}

		int j = 0, sum = 0;
		while (j < 10) {
			j++;
			if (j % 3 == 0)
			continue;
			System.out.println(j);
			sum += j;
			if (sum > 20)
			break;
		}
	}
}
