<%@page import="com.bit.vo.CenterVo"%>
<%@page import="com.bit.dao.CenterDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
		int c_no = Integer.parseInt(request.getParameter("c_no"));
		String c_name = request.getParameter("c_name");
		String c_tel = request.getParameter("c_tel");
		String c_addr = request.getParameter("c_addr");
		
		CenterVo c = new CenterVo(c_no, c_name, c_tel, c_addr);
		CenterDao dao = new CenterDao();
		int re = dao.insertCenter(c);
		if(re > 0) {
			out.print("<font color='blue'>지점 등록이 완료되었습니다.</font>");
		} else {
			out.print("<font color='red'>지점 등록이 실패했습니다.</font>");
		}
	%>
</body>
</html>