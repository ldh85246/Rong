package com.bit.exam04;

public class CageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Animal a = new Tiger();
		// Animal b = new Lion();
		// 참조변수의 자료형을 Animal로 선언하게 되면
		// 그 것과 is a 관계(상속관계)에 있는 자식클래스의
		// 객체 누구라도 참조할 수 있다.
		
		// Cage cage = new Cage();
		// cage.setAnimal(a);
		// Cage의 멤버 변수 animal의 자료형을 Animal로 설정했기 때문에
		// Animal과 is a 관계에 있는 누구라도 담을 수 있다.
		// Tiger와 Lion 모두 담을 수 있다.
		
		// cage.setAnimal(new Tiger());
		// Tiger 객체를 생성한 변수를 담아도 되고
		// 바로 객체를 생성하여 담을 수도 있다.
		
		// cage.setAnimal(new Lion());
		// Lion lion = cage.getAnimal();
		// 부모클래스의 참조변수가 자식을 바라볼 수는 있지만
		// 자식클래스의 참조변수가 부모를 바라볼 수는 없다.
		// Object ob = new Lion(); // 얘는 가능
		// Lion l = new Object(); // 얘는 불가능
		
		// Lion lion = (Lion)cage.getAnimal();
		// 대입연산자를 기준으로 좌, 우의 자료형이 is a 관계가 성립이 될 때
		// 부모클래스의 객체를 자식클래스의 참조변수에 담기 위해서는
		// 형변환연산을 수행해야 한다.
		
		// Tiger t = new Tiger();
		// Lion l = (Lion)t();
		// 형제 지간에는 형변환 할 수 없다.
		
		Cage cage = new Cage();
		cage.setAnimal(new Lion("비트사자"));
		// Lion l = (Lion)cage.getAnimal();
		// l.proLion();
		
		Tiger t = (Tiger)cage.getAnimal();
		// t.proTiger();
		// System.out.println("ok");
	}
}
