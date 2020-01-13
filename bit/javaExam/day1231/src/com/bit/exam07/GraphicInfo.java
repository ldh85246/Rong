package com.bit.exam07;

import java.awt.Color;
import java.io.Serializable;

public class GraphicInfo implements Serializable {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int drawType; // 0:선, 1:사각형, 2:원
	private Color colorType; // 0:검정, 1:빨강
	
	public GraphicInfo(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public GraphicInfo(int x1, int y1, int x2, int y2, int drawType, Color colorType) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.drawType = drawType;
		this.colorType = colorType;
	}

	public int getDrawType() {
		return drawType;
	}
	public void setDrawType(int drawType) {
		this.drawType = drawType;
	}

	public Color getColorType() {
		return colorType;
	}

	public void setColorType(Color colorType) {
		this.colorType = colorType;
	}
}
