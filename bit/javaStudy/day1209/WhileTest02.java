// 구구단 중에 2단을 출력하는 프로그램을 생성
//	while 문을 이용

class WhileTest02{
	public static void main(String[] args) {
		int i = 1;

		while (i <= 9) {
			System.out.println(2 + " * " + i + " = " + (2 * i));
			i++;
		}
	}
}
