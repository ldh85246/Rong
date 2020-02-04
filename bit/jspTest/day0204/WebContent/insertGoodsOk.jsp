<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.bit.dao.GoodsDao"%>
<%@page import="com.bit.vo.GoodsVo"%>
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
		String path = request.getRealPath("img");
		System.out.println(path);
		MultipartRequest multi = new MultipartRequest(request, path, "euc-kr");

		int no = Integer.parseInt(multi.getParameter("no"));
		String item = multi.getParameter("item");
		int price = Integer.parseInt(multi.getParameter("price"));
		int qty = Integer.parseInt(multi.getParameter("qty"));
// 		String fname = multi.getParameter("fname");
		String fname = multi.getOriginalFileName("fname");
		String detail = multi.getParameter("detail");
	%>
	입력하신 정보는 다음과 같습니다.
	<br> 상품번호 :
	<%=no%><br> 상품명 :
	<%=item%><br> 가격 :
	<%=price%><br> 수량 :
	<%=qty%><br> 사진 :
	<%=fname%><br> 상세설명 :
	<%=detail%><br>
	<%
		GoodsVo g = new GoodsVo(no, item, price, qty, fname, detail);
		GoodsDao dao = new GoodsDao();
		int re = dao.insertGoods(g);

		if (re > 0) {
			out.print("<font color='blue'>상품등록에 성공하였습니다.</font>");
		} else {
			out.print("<font color='red'>상품등록에 실패하였습니다.</font>");
		}
	%>
</body>
</html>