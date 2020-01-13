package com.bit.exam01;

public class Cube extends ThreeDimShape {
	private double width;
	private double height;
	private double length;
	
	public Cube(int x, int y, double width, double height, double length) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.length = length;
	}

	@Override
	public void calcVolume() {
		// TODO Auto-generated method stub
		volume = width * length * height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("직육면체를 그립니다.");
	}
}
