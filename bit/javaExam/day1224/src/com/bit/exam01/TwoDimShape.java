package com.bit.exam01;

abstract public class TwoDimShape extends Shape {
	protected double area;

	public TwoDimShape(int x, int y) {
		super(x, y);
	}

	public abstract void calcArea();

	public double getArea() {
		return area;
	}
	
}
