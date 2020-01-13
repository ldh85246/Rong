// 정수형 배열을 매개변수로 전달받아 그 중에 가장 큰 수를 찾아 출력하는 메소드를 정의

class MethodTest09 {
	public static void maxArr(int []n) {
		int max = n[0];
		for (int i = 1; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
			}
		}
		System.out.println("가장 큰 수는 : " + max);
	}

	public static void main(String[] args) {
		int []age = {28, 31, 20, 30, 18, 24, 25};
		int []kor = {100, 60, 70};
		maxArr(age);
		maxArr(kor);
	}
}
