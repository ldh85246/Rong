class MethodTest13 {
	public static void printFac(int n) {
		int r = 1;
		for (int i = 1; i <= n; i++) {
			r *= i;
		}
		System.out.println(r);
	}

	public static int getFac(int n) {
		int r = 1;
		for (int i = 1; i <= n; i++) {
			r *= i;
		}
		return r;
	}

	public static void main(String[] args) {
		printFac(5);			// n�� �Ű������� ���޹޾� n!�� ���Ͽ� ���
		int r = getFac(5);		// n�� �Ű������� ���޹޾� n!�� ���Ͽ� ��ȯ
		System.out.println(r);
	}
}