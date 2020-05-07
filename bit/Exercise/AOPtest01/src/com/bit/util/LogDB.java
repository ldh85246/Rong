package com.bit.util;

import java.util.Date;

public class LogDB {
	public void write(String methodName, long start, long end) {
		System.out.println("DB에 기록합니다.");
		Date today = new Date();
		System.out.println(methodName + "가" + today + "에 요청되었습니다.");
		System.out.println("걸린시간은 " + (end - start));
		System.out.println("==============================");
		
	}
}
