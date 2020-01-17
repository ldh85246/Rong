class CharTest3 {
	public static void main(String[] args) {
		int cnt = 0;
		String data = "hello java hello korea";
		int n = data.length();
		System.out.println("문자열의 길이 : " + n);

		for(int i = 0; i < n; i = i + 1) {
			char ch = data.charAt(i);
			if (ch == 'a')
				cnt = cnt + 1 ;
		}
		System.out.println("소문자 a의 개수는 " + cnt + " 입니다.");
	}
}
