class StudentTest {
	public static void main(String[] args) {
		String name[] = {"현민아", "최영수", "한주련",
						"최봉현", "이희재", "이원우", "이수인"};
		int age[] = {29, 28, 32, 29, 25, 31, 28};

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "   " + age[i]);
		}

		// 나이가 낮은 순으로 정렬합니다.
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + age[i]);
			if (i = 0; i < age.length; i++) {
				if (int j = i + 1; j < age.length; j++) {
					int tmp = age[i];
					age[i] = age[j];
					age[j] = age[i];
				}
			}
		}
	}
}
