class Data1 {
	public static void main(String[] args) {
		int n = 10;
		//int n;
		System.out.println("The value of n : " + n);
		/*
		Data1.java:5: error: variable n might not have been initialized
						System.out.println("The value of n : " + n);
		*/

		boolean flag = false;
		System.out.println(flag);

		int 임시 = 20; // double로도 가능
		System.out.println(임시);

		byte index = 100;
		// byte index = 200;
		System.out.println(index);
		/*
		Data1.java:18: error: incompatible types: possible lossy conversion from int to
		byte
						byte index = 200;
		*/
	}
}
