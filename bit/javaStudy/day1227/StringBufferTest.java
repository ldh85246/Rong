class StringBufferTest {
	public static void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ģ����");
		sb.append(" ����߳�");
		System.out.println(sb);
		sb.insert(0, "ģ���� ");
		System.out.println(sb);

//		print(sb); // ��� �Ұ�, type�� �ȸ���
		print(sb.toString());
	}
}