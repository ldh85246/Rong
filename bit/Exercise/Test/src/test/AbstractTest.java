package test;

public class AbstractTest {
	public static void main(String[] args) {
		Car c = new Car(0);
		double r = c.getKillosPerLiter();
		
		System.out.println(r);
		c.printSpeed();
	}
}

abstract class Vehicle {
	int speed;
	
	public abstract double getKillosPerLiter();
	
	public void printSpeed() {
		System.out.println(speed);
	}
}

class Car extends Vehicle {

	public Car(int speed) {
		this.speed = speed;
	}

	@Override
	public double getKillosPerLiter() {
		return 10;
	}
}