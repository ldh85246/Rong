<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 의도적으로 3초 뒤에 응답하도록 지연시키기
	try {
		Thread.sleep(3000);
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
%>
hello