package com.bit.exam01;

import java.util.ArrayList;

class Animal {
	
}

class Lion extends Animal {
	
}

class Tiger extends Animal {
	
}

public class Cage<T> {
	private T animal;
	private ArrayList<Tiger> tigerList;
	private ArrayList<Lion> lionList;
	
	public void setAnimal(T x) {
		animal = x;
	}
	
	public Object getAnimal() {
		return animal;
	}
	
	public static void main(String[] args) {
		Cage cage = new Cage();
		cage.setAnimal(new Lion());
		Lion lion = (Lion)cage.getAnimal();
		Tiger tiger = (Tiger)cage.getAnimal();
	}
}
