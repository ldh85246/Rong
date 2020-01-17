// 가장 큰 값이 위치한 index도 구하여 출력해보세요.

import java.util.ArrayList;

class MaxOfArray02 {
	public static void main(String[] args) {
		int []a = {10, 31, 100, 11, 100};
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		ArrayList<Integer> position = new ArrayList<Integer>(); // 동적 배열
		for (int i = 0; i < a.length; i++) {
			if (max == a[i]) {
				position.add(i);
			}
		}
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 큰 값이 있는 자리 : " + position);
	}
}
