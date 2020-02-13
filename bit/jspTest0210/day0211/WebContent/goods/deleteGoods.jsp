<%@page import="java.io.File"%>
<%@page import="com.bit.dao.GoodsDao"%>
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
	int no = Integer.parseInt(request.getParameter("no"));
	GoodsDao dao = new GoodsDao();
	String oldFname = dao.getGoods(no).getFname();
	
	int re = dao.deleteGoods(no);
	if (re > 0) {
		String path = request.getRealPath("upload");
		File file = new File(path + "/" + oldFname);
		file.delete();
		response.sendRedirect("listGoods.jsp");
	} else {
		out.print("<font color='red'>상품삭제에 실패하였습니다.</font>");
	}
%>
</body>
</html>