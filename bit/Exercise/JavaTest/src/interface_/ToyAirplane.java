package interface_;

public class ToyAirplane implements Toy {
	@Override
	public void walk() {
		System.out.println("The Airplane can not walk.");
	}
	@Override
	public void run() {
		System.out.println("The Airplane can not run.");
	}
	@Override
	public void alarm() {
		System.out.println("The Airplane has alarm function.");
	}
	@Override
	public void light() {
		System.out.println("The Airplane has no light function.");
	}

}
