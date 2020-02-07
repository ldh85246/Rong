package com.bit.test;

public class MyUtil {

	// 정수형 변수 2개를 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 정의
	public int max(int a, int b) {
		int r;
		if (a > b) {
			r = a;
		} else {
			r = b;
		}
		return r;
	}

	// 실수형 변수 2개를 전달받아 그 중에 큰 수를 찾아 반환하는 메소드를 정의
	public double max(double a, double b) {
		double r = a;
		if (b > r) {
			r = b;
		}
		return r;
	}
	
	
}
