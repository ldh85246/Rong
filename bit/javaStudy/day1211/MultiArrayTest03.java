class MultiArrayTest03 {
	public static void main(String[] args) {
		// int []a = {1, 2, 3, 4, 5};
		// int [][]b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [][]c = {{1, 2,}, {3, 4, 5, 6, 7}, {8, 9, 10}};

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.println(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
