<%@page import="com.bit.vo.GoodsVo"%>
<%@page import="java.util.ArrayList"%>
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
	<h2>상품목록</h2>
	<hr>
	<%
		String path = request.getRealPath("upload");
		System.out.println(path);
	
		GoodsDao dao = new GoodsDao();
		ArrayList<GoodsVo> list = dao.listAll();
	%>
	<a href="insertGoods.html">상품등록</a><br>
	<table border="1" width="80%">
		<tr>
			<td>상품번호</td>
			<td>상품명</td>
			<td>가격</td>
			<td>수량</td>
			<td>사진</td>
		</tr>
		
		<%
			for (GoodsVo g : list) {
				%>
					<tr>
						<td><%=g.getNo()%></td>
						<td>
							<a href="detailGoods.jsp?no=<%=g.getNo()%>"><%= g.getItem() %></a>
						</td>
						<td><%=g.getPrice()%></td>
						<td><%=g.getQty()%></td>
						<td><img src="../upload/<%=g.getFname()%>" width="50" height="50"></td>
					</tr>
				<%
			}
		%>
	</table>
</body>
</html>