class CallByReferenceTest01 {
	// 정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 1씩 증가하는 메소드
	public static void plus(int []a) {
		for (int i = 0; i < a.length; i++) {
			a[i] += 1;
		}
	}

	public static void main(String[] args) {
		int []arr = {10, 20, 30};
		plus(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
