class StringBufferTest {
	public static void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("친구를");
		sb.append(" 사랑했네");
		System.out.println(sb);
		sb.insert(0, "친구의 ");
		System.out.println(sb);

//		print(sb); // 얘는 불가, type이 안맞음
		print(sb.toString());
	}
}
