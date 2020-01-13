// 정수형 배열을 매개변수로 전달받아 배열의 총합과 평균을 구하여 출력하는 메소드

class MethodTest10 {
	public static void printSum(int []n) {
		int tot = 0;
		double avg = 0;
		for (int i = 0; i < n.length; i++) {
			tot += n[i]; // 				
		}
		avg = tot / (double)n.length;
		System.out.println("*** 배열의 요약 정보 ***");
		System.out.print("총합 : " + tot);
		System.out.printf("평균 : %.2f\n", avg);
	}

	public static void main(String[] args) {
		int []age = {28, 31, 20, 30, 18, 24, 25};
		int []kor = {100, 60, 70};
		printSum(age);
		printSum(kor);
	}
}
