// 현재는 값이 다른 것으로 나온다.

class ArraysTest {
	public static void main(String[] args) {
		int[] a = {100, 200, 300};
		int[] b = {100, 200, 300};

		if (a == b) {
			System.out.println("두 배열의 요소는 같습니다.");
		} else {
			System.out.println("두 배열의 요소는 같지 않습니다.");
		}
	}
}
