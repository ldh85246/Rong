class MethodTest04 {
	// n�� �Ű������� ���޹޾� 1���� n������ ���� �����Ͽ� ����ϴ� �޼ҵ带 �����ϰ� ȣ��
	public static void sum(int n) {
		int tot = 0;
		for (int i = 1; i <= n; i++) {
			tot = tot + i;
		}
	System.out.println("1���� " + n + "������ ���� : " + tot);
	return; // �޼ҵ带 ȣ���� �� return�� �ڵ� ���ԵǾ� �ִ� ����
	}

	public static void gugudan(int x) {
		System.out.println(x + "��");
		for (int i = 1; i <= 9; i++) {
			System.out.println(x + " * " + i + " = " + (x * i));
		}
	}

	public static void plus(int a, int b) {
		int r = a + b;
		System.out.println("���ϱ� ��� : " + r);
	}

	public static void main(String[] args) {
		sum(5);
		sum(100);
		gugudan(2);
		gugudan(7);
		plus(2, 3);
	}
}