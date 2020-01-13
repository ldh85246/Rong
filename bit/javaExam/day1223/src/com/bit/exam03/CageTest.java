package com.bit.exam03;

public class CageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Tiger();
		Animal b = new Lion();

		Cage cage = new Cage();
		// cage.setAnimal(a);
		// 현재의 Cage의 animal멤버변수는 Tiger로 설정되어 있다.
		// Tiger와 is a 관계에 있는 것만 담을 수 있다.
		// 현재 Tiger의 후손은 없으니 Tiger만 설정할 수 있다.
		// 즉, Tiger의 부모(Animal)는 담을 수 없다.
		
		Tiger c = new Tiger();
		cage.setAnimal(c);
		
		// Lion d = Lion();
		// cage.setAnimal(d);
		// 부모를 못 담아내니 나와 형제지간인 Lion도 못 담아낸다.
	}
}
