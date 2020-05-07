package anonymous;

public class Main_ano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new AnonymousClass() {
			
			@Override
			public void method() {
				System.out.println("-- AnonymousClass's Override method START --");
			};
		}.method();
	}

}
