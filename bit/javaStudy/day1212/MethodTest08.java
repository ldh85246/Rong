// 정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 출력하는 메소드를 정의

class MethodTest08{
	public static void printArr(int []a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int []age = {28, 31, 20, 30, 18, 24, 25};
		printArr(age);

		int []kor = {100, 60, 70};
		printArr(kor);
	}
}
