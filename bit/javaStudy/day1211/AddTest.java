// java AddTest 2 4

class AddTest {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); // String을 정수로 바꿔주는 기능
		int b = Integer.parseInt(args[0]);
		int r = a + b;
		System.out.println("더하기 결과 : " + r);
	}
}
