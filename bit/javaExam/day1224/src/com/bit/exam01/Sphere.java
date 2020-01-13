package com.bit.exam01;

public class Sphere extends ThreeDimShape {
	private double radius;

	public Sphere(int x, int y, double radius) {
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
	public void calcVolume() {
		// volume = 4/3 * Math.PI * radius * radius * radius;
		volume = 4/3 * Math.PI * Math.pow(radius, 3);		
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원기둥을 그립니다.");
	}	
}
