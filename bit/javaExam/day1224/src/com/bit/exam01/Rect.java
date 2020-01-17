package com.bit.exam01;

public class Rect extends TwoDimShape {
	private double width;
	private double height;
	
	public Rect(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void calcArea() {
		area = width * height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그립니다.");
	}

}
