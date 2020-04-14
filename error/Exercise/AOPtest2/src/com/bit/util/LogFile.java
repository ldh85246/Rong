package com.bit.util;

import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class LogFile {
	public void write(JoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().toShortString();
		Date today = new Date();
		System.out.println("파일에 로그 기록");
		System.out.println(methodName + "가" + today + "에 요청되었습니다.");
	}
}
