class ConditionOperator {
	public static void main(String[] args) {
		int i = 7;
		String r = (i >= 0) ? "���" : "����";
		System.out.println(r);
		//System.out.println((i >= 0) ? "���" : "����");
		// (i > 0) ? System.out.println("���") : System.out.println("����");

		/*
		int j = (i > 0) ? 1 : 0;
		int j = (i > 0) ? i + 100 : i * 2;
		System.out.println(j);
		*/
	}
}