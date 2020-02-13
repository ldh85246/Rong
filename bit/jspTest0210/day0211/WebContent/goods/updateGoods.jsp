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
<h2>상품수정</h2>
	<hr>
	<%
		int no = Integer.parseInt(request.getParameter("no"));
		GoodsDao dao = new GoodsDao();
		GoodsVo g = dao.getGoods(no);
	%>
	
	<form action="updateGoodsOk.jsp" method="post" enctype="multipart/form-data">
		<input type="hidden" name="no" value="<%=no%>">
		<table width="60%">
			<tr>
				<td>상품명</td>
				<td><input type="text" name="item" value="<%= g.getItem() %>" required="required"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="number" name="price" value="<%= g.getPrice() %>" required="required"></td>
			</tr>
			<tr>
				<td>수량</td>
				<td><input type="number" name="qty" value="<%= g.getQty() %>" required="required"></td>
			</tr>
			<tr>
				<td>사진</td>
				<td>
					<img src="../upload/<%=g.getFname()%>" width="20" height="20"><br>
					<input type="file" name="fname">
				</td>
			</tr>
			<tr>
				<td>상세설명</td>
				<td><textarea rows="10" cols="80" name="detail"><%= g.getDetail() %></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="확인">
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>