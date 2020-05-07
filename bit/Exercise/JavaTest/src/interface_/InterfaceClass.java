package interface_;

public class InterfaceClass implements Interface_a, Interface_b {

	public InterfaceClass() {
		System.out.println("-- InterfaceClass Constructor --");
	}
	
	@Override
	public void funA() {
		System.out.println("-- funA --");
	}
	
	@Override
	public void funB() {
		System.out.println("-- funB --");
	}

}
