class StringTest03 {
	public static void main(String[] args) {
		String data = "Hello Korea Hello Java";
//		int n = data.indexOf("K");
		int n = data.lastIndexOf("Hello");
		System.out.println(n);
	}
}
