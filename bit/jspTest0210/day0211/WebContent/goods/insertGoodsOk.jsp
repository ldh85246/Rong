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
		// 상품목록, 상품상세, 상품수정, 상품삭제에 대한 기능을 차례대로 구현합니다.
		
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
	
	<%
		// GoodsVo g = new GoodsVo(no, item, price, qty, fname, detail);
		GoodsVo g = new GoodsVo();
		g.setItem(item);
		g.setPrice(price);
		g.setQty(qty);
		g.setFname(fname);
		g.setDetail(detail);
		// 상품번호는 시퀀스를 통해 자동으로 부여됨으로 설정하지 않아요.
		
		GoodsDao dao = new GoodsDao();
		int re = dao.insertGoods(g);

		if (re > 0) {
			response.sendRedirect("listGoods.jsp");
		} else {
			out.print("<font color='red'>상품등록에 실패하였습니다.</font>");
		}
	%>
</body>
</html>