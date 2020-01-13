class Singer {
	private String name;
	public void setName(String n){
		name = n;
	}

	public String getName() {
		return name;
	}

	public void sing() {
		System.out.println("³ë·¡!");
	}
}

class SingerTest {
	public static void main(String[] args) {
		Singer s;
		s = new Singer();
		s.setName("¹ÚÀ¯Ã¶");
		s.sing();
	}
}
