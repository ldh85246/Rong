class SwitchTest02 {
	public static void main(String[] args) {
		int n = 10;

		switch (n) {
		case 0 : 
		case 1 : 
		case 2 : System.out.println("이"); break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println("오"); break;
		case 6 : 
		case 7 : 
		case 8 : 
		case 9 : System.out.println("구"); break;
		default : System.out.println("0~9 사이의 값이 아님");
		}
		System.out.println("작업종료");
	}
}
