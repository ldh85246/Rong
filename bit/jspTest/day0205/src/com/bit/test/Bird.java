package com.bit.test;

public class Bird {
	String name;
	String color;
	boolean wing;
	
	public Bird(String name, String color, boolean wing) {
		this.name = name;
		this.color = color;
		this.wing = wing;
	}
	
	public void fly () {
		if (wing == true) {
			System.out.println(color + "ªˆ " + name + "¿Ã(∞°) »Œ»Œ");
		}
	}
}
