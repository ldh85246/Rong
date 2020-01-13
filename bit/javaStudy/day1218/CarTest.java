abstract class Vehicle {
	protected int speed;
	public abstract double getKilosPerLiter();
	public abstract void printSpeed();

	public Vehicle (int speed) {
		this.speed = speed;
	}
}

class Car extends Vehicle {
	private double kilos;
	private double oil;

	public Car(int speed, double kilos, double oil) {
		super(speed);
		this.kilos = kilos;
		this.oil = oil;
	}

	public double getKilos() {
		return kilos;
	}

	public void setKilo(double kilos) {
		this.kilos = kilos;
	}

	public double getOil() {
		return oil;
	}

	public void setOil(double oil) {
		this.oil = oil;
	}

	public double getKilosPerLiter() {
		return kilos / oil;
	}

	public void printSpeed() {
		System.out.println("현재속도 : " + speed + "km");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car(100, 50, 7.5);

		System.out.println("연비는 : " + c.getKilosPerLiter());
		c.printSpeed();
	}
}
