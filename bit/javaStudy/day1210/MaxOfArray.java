// 가장 큰 값이 위치한 index도 구하여 출력해보세요.

class MaxOfArray {
	public static void main(String[] args) {
		int []a = {10, 31, 10, 11, 100};
		int max = a[0];
		int position = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				position = i;
			}
		}
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 큰 값이 있는 자리 : " + position);
	}
}
