package com.example.demo;

import java.io.FileWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component // 자동으로 객체 생성해주는 어노테이션
@Aspect
public class LoggingAspect {
	// 메소드 명이 곧 id가 됨.
	@Pointcut("execution(public * com.example.damo.controller..*(..))")
	private void contMethod() {

	}

	@Before("contMethod()")
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		HttpServletRequest request = (HttpServletRequest) joinPoint.getArgs()[0];
		String uri = request.getRequestURI();
		String ip = request.getRemoteAddr();
		String time = new Date().toLocaleString();
		String msg = uri + "/" + "ip" + time + "\r\n";
		Date today = new Date();
		int yy = today.getYear() + 1900;
		int mm = today.getMonth() + 1;
		int dd = today.getDate();
		String fname = yy + "" + mm + "" + dd + ".txt";
		String path = "C:/bitLogData";
		try {
			FileWriter fw = new FileWriter(path + "/" + fname, true);
			fw.write(msg);
			fw.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("요청한 uri : " + uri);
		System.out.println(methodName + "실행 전");
	}
}
