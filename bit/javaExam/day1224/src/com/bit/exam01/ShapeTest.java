package com.bit.exam01;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		Triangle t = new Triangle(10, 10, 20, 30);
		Cylinder cy = new Cylinder(20, 20, 5, 20);
		Cube cu = new Cube(30, 30, 10, 10, 10);
		
		// 세개의 객체에게 호출한 메소드는 동일하다.
		// 그러나 t는 삼각형을 그리고, cy는 원기둥을 그리고, cu는 직육면체를 그린다.
		// 이와 같이 객체에게 준 메세지는 동일하나 객체마다 하는 일이 다른 것을 '다형성'이라 한다.
		/*
		 다형성 : 객체에게 준 메시지는 동일한데(호출하는 메시지는 동일한데) 객체마다 동작방식(하는 일)이 다름
		 상속과 오버라이딩과 관련이 있음
		 */
		
		t.draw();
		cy.draw();
		cu.draw();
		
		// Shape[] arr = new Shape[100];
		
//		ArrayList<Shape> arr = new ArrayList<Shape>();
//		
//		arr.add(new Circle(10, 10, 50));
//		arr.add(new Cube(10, 120, 50, 50, 50));
//		arr.add(new Cylinder(10, 200, 50, 200));
//		
//		for (Shape p : arr) {
//			System.out.println(p);
//			if (p instanceof TwoDimShape) {
//				((TwoDimShape)p).calcArea();
//				System.out.println("도형의 면적 : " + ((TwoDimShape)p).getArea());
//			} else if (p instanceof ThreeDimShape) {
//				((ThreeDimShape)p).getVolume();
//				System.out.println("도형의 체적 : " + ((ThreeDimShape)p).getVolume());
//			}
//		}
	}
}
