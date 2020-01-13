class Father {
	public void make() {
		System.out.println("짜장");
	}
}

class Son extends Father {
	public void make() {
		System.out.println("간짜장");
	}

	public void service() {
		System.out.println("고객만족");
	}
}

class ChineseFood {
	public static void main(String[] args) {
		Father f = new Father();
		f.make();

		Father s = new Son();
		s.make();
		((Son)s).service();
	}
}
