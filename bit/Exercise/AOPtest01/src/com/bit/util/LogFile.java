package com.bit.util;

import java.util.Date;

public class LogFile {
	public void write(String methodName) {
		Date today = new Date();
		System.out.println("파일에 로그 기록");
		System.out.println(methodName + "가" + today + "에 요청되었습니다.");
	}
}
