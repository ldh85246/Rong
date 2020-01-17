package com.bit.exam01;

public abstract class ThreeDimShape extends Shape {
	protected double volume;

	public ThreeDimShape(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public abstract void calcVolume();

	public double getVolume() {
		return volume;
	}
	
}
