package exception;

public class Main_exception {

	public static void main(String[] args) {
//		int i = 10;
//		int j = 0;
//		int r = 0;
//		
//		System.out.println("Exception BEFORE");
//		
//		try {
//			r = i / j;	
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("Exception AFTER");

		Main_exception main = new Main_exception();

		try {
			main.firstMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void firstMethod() throws Exception {
		secondMethod();
	}

	public void secondMethod() throws Exception {
		thirdMethod();
	}

	public void thirdMethod() throws Exception {
		System.out.println("10 / 0 = " + (10 / 0));
	}
}
