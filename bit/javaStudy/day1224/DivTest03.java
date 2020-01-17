class DivTest03 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int r = a / b;
			System.out.println("결과 : " + r);
		} catch (Exception e) {
			System.out.println("나누기 할 두 정수를 확인해주세요.");
		}
	}
}
