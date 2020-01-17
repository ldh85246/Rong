package com.bit.exam05;

// Cage객체 생성 시 animal의 자료형을 결정하도록 제네릭으로 설정한다.
// class Cage<T>
// T는 그냥 애칭이니 마음대로 정해도 된다.

// main메소드에서 Cage<Tiger> c = new Cage<Tige>라고 한다면
// T는 Tiger로 변환되어 처리된다. 
// 즉, animal의 자료형을 Tiger로 하겠다라는 의미이다.

// 만약 Cage<Animal> c = new Cage<Animal>이라고 한다면
// T는 Animal로 변환되어 처리된다.(제네릭)
public class Cage<T> {
	private T animal;

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
}
