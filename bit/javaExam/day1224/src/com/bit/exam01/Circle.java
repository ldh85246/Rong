package com.bit.exam01;

public class Circle extends TwoDimShape {
	private double radius;
	// public static final double PI = 3.141592;
		
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calcArea() {
		area = Math.PI * radius * radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그립니다.");
	}
}
