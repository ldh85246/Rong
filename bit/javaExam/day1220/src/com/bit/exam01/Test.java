package com.bit.exam01;

import java.util.Random;

class GameCharacter {
	Random r = new Random();
	
	public void draw() {
		System.out.println("GameCharacter()의 draw()");
	}
	
	public void getLife() {
		System.out.println("GameCharacter()의 getLife()");
	}
	
	public String toString() {
		return "";
	}
}

class Hobitt extends GameCharacter {
	public void draw() {
		System.out.println("호빗을 그립니다.");
	}
	
	public void getLife() {
		System.out.println("GameCharacter()의 getLife()");
	}
}

class Titan extends GameCharacter {
	public void draw() {
		System.out.println("타이탄을 그립니다.");
	}
	
	public void getLife() {
		System.out.println("GameCharacter()의 getLife()");
	}
}

class Sorcerer extends GameCharacter {
	public void draw() {
		System.out.println("주술사를 그립니다.");
	}
	
	public void getLife() {
		System.out.println("GameCharacter()의 getLife()");
	}
}

public class Test {

	public static void main(String[] args) {
		GameCharacter g1 = new Hobitt();
	}
}
