package com.bit.exam01;

public class Cylinder extends ThreeDimShape {
	private double radius;
	private double height;
	
	public Cylinder(int x, int y, double radius, double height) {
		super(x, y);
		this.radius = radius;
		this.height = height;
	}

	@Override
	public void calcVolume() {
		// TODO Auto-generated method stub
		volume = Math.PI * Math.pow(radius, 2) * height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원기둥을 그립니다.");
	}
}
