class ExceptionTest03 {
	public static void div(int a, int b) throws ArithmeticException {
		// �޼ҵ带 ����ϴ� ��(ȣ���ϴ� ��)���� ����ó���� ����
		int r = a / b;
		System.out.println("��� : " + r);
	}

	public static void main(String[] args) {
			div(4, 0);
	}
}