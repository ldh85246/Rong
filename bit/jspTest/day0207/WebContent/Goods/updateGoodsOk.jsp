<%@page import="java.io.File"%>
<%@page import="com.bit.vo.GoodsVo"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
		GoodsDao dao = new GoodsDao();
		request.setCharacterEncoding("euc-kr");
		String path = request.getRealPath("upload");
		System.out.println(path);
		MultipartRequest multi = new MultipartRequest(request, path, "euc-kr");
		
		int no = Integer.parseInt(multi.getParameter("no"));
		
		// 상품을 수정하기 전에 원래 상품사진 파일명을 담아둡니다.
		String oldFname = dao.getGoods(no).getFname();
		
		String item = multi.getParameter("item");
		int price = Integer.parseInt(multi.getParameter("price"));
		int qty = Integer.parseInt(multi.getParameter("qty"));
		// String fname = multi.getParameter("fname");
		
		// 새로 업로드할 상품사진 파밀명을 담아와요
		String fname = multi.getOriginalFileName("fname");
		String detail = multi.getParameter("detail");

		// GoodsVo g = new GoodsVo(100, item, price, qty, fname, detail);
		GoodsVo g = new GoodsVo();
		g.setNo(no);
		g.setItem(item);
		g.setPrice(price);
		g.setQty(qty);
		g.setDetail(detail);
		
		// 상품사진을 수정하지 않으면 원래의 사진 파일명을 vo에 담고
		// 상품사진도 수정한다면 업로드한 사진 파일명을 vo에 담아요
		g.setFname(oldFname);
		if (fname != null) {
			g.setFname(fname);
		}
		
		int re = dao.updateGoods(g);
		if (re > 0) {
			if (fname != null) {
				File file = new File(path + "/" + oldFname);
				file.delete();
			}
			response.sendRedirect("listGoods.jsp");
		} else {
			out.print("<font color='red'>수정에 실패하였습니다.</font>");
		}
	%>
</body>
</html>