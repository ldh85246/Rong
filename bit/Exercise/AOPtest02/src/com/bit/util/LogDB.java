package com.bit.util;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogDB {
	public Object write(ProceedingJoinPoint joinpoint) {
		String methodName = joinpoint.getSignature().toShortString();
		long start = System.currentTimeMillis();
		System.out.println("DB에 기록합니다.");
		
		Object re = null;
		try {
			re = joinpoint.proceed();
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		long end = System.currentTimeMillis();
		Date today = new Date();
		System.out.println(methodName + "가" + today + "에 요청되었습니다.");
		System.out.println("걸린시간은 " + (end - start));
		System.out.println("==============================");
		return re;
	}
}
