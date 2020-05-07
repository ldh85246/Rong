package interface_;

public class ToyRobot implements Toy {
	@Override
	public void walk() {
		System.out.println("The Robot can walk.");
	}
	@Override
	public void run() {
		System.out.println("The Robot can run.");
	}
	@Override
	public void alarm() {
		System.out.println("The Robot has no alarm function.");
	}
	@Override
	public void light() {
		System.out.println("The Robot has light function.");
	}

}
