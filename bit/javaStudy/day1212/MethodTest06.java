// 정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 출력하는 메소드를 정의

class MethodTest06{
	public static void printArray(int []k) {
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int []arr = {100, 200, 300, 400, 500};
		printArray(arr);
	}
}
