<%@page import="com.bit.vo.GoodsVo"%>
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
	<h2>상세보기</h2>
	<hr>
	<%
		int no = Integer.parseInt(request.getParameter("no"));
		GoodsDao dao = new GoodsDao();
		GoodsVo g = dao.getGoods(no);
	%>
	상품번호 : <%= g.getNo() %><br>
	상품명 : <%= g.getItem() %><br>
	가격 : <%= g.getPrice() %><br>
	수량 : <%= g.getQty() %><br>
	<img src="../upload/<%=g.getFname()%>" width="200" height="200"><br>
	상세설명 : <br>
	<textarea rows="10" cols="80" readonly="readonly"><%= g.getDetail() %></textarea>
	<hr>
	<a href="updateGoods.jsp?no=<%=g.getNo()%>">수정</a>
	<a href="deleteGoods.jsp?no=<%=g.getNo()%>">삭제</a>
</body>
</html>