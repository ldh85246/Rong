<%@page import="com.bit.vo.CarTypeVo"%>
<%@page import="com.bit.dao.CarTypeDao"%>
<%@page import="com.bit.dao.CenterDao"%>
<%@page import="com.bit.dao.OptionTypesDao"%>
<%@page import="com.bit.vo.CenterVo"%>
<%@page import="com.bit.vo.OptionTypesVo"%>
<%@page import="java.util.ArrayList"%>
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
		CenterDao c_dao = new CenterDao();
		ArrayList<CenterVo> list = c_dao.listAll();
		
		OptionTypesDao ot_dao = new OptionTypesDao();
		ArrayList<OptionTypesVo> ot_list = ot_dao.listAll();
		
		CarTypeDao t_dao = new CarTypeDao();
		ArrayList<CarTypeVo> t_list = t_dao.listAll();
	%>
	<h2>자동차 등록</h2>
	<hr>
	<form action="insertCarOk.jsp" method="post">
		사무소 선택 : 
		<select name="c_no">
			<%
				for(CenterVo c : list) {
			%>
			<option value="<%= c.getC_no() %>"> <%= c.getC_name() %> </option>
			<%
				}
			%>
		</select>
		<br>
		차량등록번호 : <input type="number" name="car_no"><br>
		차종 : <input type="text" name="c_type"><br>
		색상 : 
		<select name="color">
			<option value="red"> 빨간색 </option>
			<option value="white"> 흰색 </option>
			<option value="black"> 검정색 </option>
		</select>
		<br>
		일일대여료 : <input type="number" name="rent_fee"><br>
		몇인승 : 
		<select name="seats">
			<option value="4"> 4인승 </option>
			<option value="8"> 8인승 </option>
			<option value="12"> 12인승 </option>
		</select>
		<br>
		사진 : <input type="text" name="fname"><br>
		옵션 : 
		<%
			for (OptionTypesVo ot : ot_list) {
				%>
					<input type="checkbox" name="o_no" value="<%= ot.getO_no() %>"> <%= ot.getO_name() %>
				<%
			}
		%>
		<br>		
		자동차 타입 : 
		<select name="t_no">
			<%
				for (CarTypeVo t : t_list) {
					%>
						<option value="<%= t.getT_no() %>"> <%= t.getT_name() %> </option>
					<%
				}
			%>
		</select><br>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
</body>
</html>