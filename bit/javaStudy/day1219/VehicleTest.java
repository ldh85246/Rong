abstract class Vehicle {
	abstract public double getKilosPerLiter();
	protected int speed;
	
	public void speedUp(int amount) {
		speed = speed + amount;
	}

	public void speedDown(int amount) {
		speed = speed - amount;
	}

	public void printSpeed() {
		System.out.println("현재 시속 : " + speed);
	}

	public void turnLeft() {
		System.out.println("좌회전을 합니다");		
	}

	public void turnRight() {
		System.out.println("우회전을 합니다");		
	}
}

class Car extends Vehicle {
	private int seater;
	public Car(int seater) {
		this.seater = seater;
	}

	public double getKilosPerLiter() {
		return 10;
	}

	public String toString() {
		return "이 차는 " + seater + "인승이며, 현재 시속은 " + speed + "km 입니다";
	}
}

class VehicleTest {
	public static void main(String[] args) {
		Car c = new Car(4);
		System.out.println(c.getKilosPerLiter());
		c.printSpeed();

		c.speedUp(60);
		c.printSpeed();
		c.speedUp(40);
		c.printSpeed();
		System.out.println(c);
	}
}
