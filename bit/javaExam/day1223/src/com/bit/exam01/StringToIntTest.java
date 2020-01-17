package com.bit.exam01;

public class StringToIntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data1 = "100";
		String data2 = "200";
		
		// data1과 data2를 정수형으로 변환한 다음 더하기 결과를 출력해보세요.
		
		int r = Integer.parseInt(data1) + Integer.parseInt(data2);
		// String을 Integer로, Integer를 int형으로 자동 변환(auto Unboxing) 
		
		System.out.println(r);
	}
}
