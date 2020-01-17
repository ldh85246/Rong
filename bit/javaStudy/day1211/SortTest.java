class SortTest {
	public static void main(String[] args) {
		int []a = {23, 36, 14, 33, 38, 41};
		
		// 14, 23, 33, 36, 38, 41
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
