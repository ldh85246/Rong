<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.bit.dao.CarDao"%>
<%@page import="com.bit.vo.CarVo"%>
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
		
		String path = "c:/rentcar";
	
		MultipartRequest multi = new MultipartRequest(request, path);
	
		int car_no = Integer.parseInt(multi.getParameter("car_no"));
		String car_type = multi.getParameter("car_type");
		String color = multi.getParameter("color");
		int seats = Integer.parseInt(multi.getParameter("seats"));
		int rent_fee = Integer.parseInt(multi.getParameter("rent_fee"));
		String fname = multi.getParameter("fname");
		int c_no = Integer.parseInt(multi.getParameter("c_no"));
		int t_no = Integer.parseInt(multi.getParameter("t_no"));
		
		String[] arr_option = multi.getParameterValues("o_no");
		
		// 1. CarVo를 생성하고 사용자가 요청한 정보를 vo에 담아요
		CarVo c = new CarVo();
		c.setCar_no(car_no);
		c.setCar_type(car_type);
		c.setColor(color);
		c.setSeats(seats);
		c.setRent_fee(rent_fee);
		c.setFname(fname);
		c.setC_no(c_no);
		c.setT_no(t_no);
//		CarVo c = new CarVo(car_no, car_type, color, seats, rent_fee, fname, c_no, t_no);
		
		// 2. CarDao를 생성하여 insert를 요청합니다.
		CarDao c_dao = new CarDao();
//		int re = c_dao.insertCar(c);
		
		// 3. 자동차 등록에 성공하면 옵션의 수 만큼 options에 레코드를 추가합니다.
//		if (re > 0) {
// 			for (String option : arr_option) {
// 				int o_no = Integer.parseInt(option);
// 				c_dao.insertOptions(car_no, o_no);
// 			}
			%>
				입력한 정보는 다음과 같습니다.<hr>
				차량등록번호 : <%= car_no %><br>
				차종 : <%= car_type %><br>
				색상 : <%= color %><br>
				좌석 수 : <%= seats %><br>
				일일대여료 : <%= rent_fee %><br>
				사진파일명 : <%= fname %><br>
				지점 번호 : <%= c_no %><br>
				자동차 타입 : <%= t_no %><br>
				옵션의 종류 : 
			<%	for (String option : arr_option) {
					out.print(option + " ");
				}
// 		} else {
// 			out.print("<font color = 'red'> 차량등록에 실패하였습니다. </font>");
// 		}
		%>
</body>
</html>