// ������ �迭�� �Ű������� ���޹޾� �� �߿� ���� ū ���� ã�� ����ϴ� �޼ҵ带 ����

class MethodTest09 {
	public static void maxArr(int []n) {
		int max = n[0];
		for (int i = 1; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
			}
		}
		System.out.println("���� ū ���� : " + max);
	}

	public static void main(String[] args) {
		int []age = {28, 31, 20, 30, 18, 24, 25};
		int []kor = {100, 60, 70};
		maxArr(age);
		maxArr(kor);
	}
}