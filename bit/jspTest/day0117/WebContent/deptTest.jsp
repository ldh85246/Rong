<%@page import="com.bit.dao.DeptDao"%>
<%@page import="com.bit.vo.DeptVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function pro (tr) {
		
		// class명이 tdlist인 것을 찾아서 모두 배경색을 흰색으로 색칠한다.
		var tdlist = document.getElementsByClassName("tdlist");
		for (i = 0; i < tdlist.length; i++) {
			tdlist[i].style.background = "white";
		}
		
		tr.style.background = "hotpink";
		
		var list = tr.childNodes;
		// alert(list[0].innerHTML);
		var dno = document.getElementById("dno");
		var dname = document.getElementById("dname");
		var dloc = document.getElementById("dloc");
		
		// td안의 값을 읽어 오거나 설정하려면		=> innerHTML
		// input태그에 값을 읽어오거나 설정하려면	=> value
		dno.value = list[0].innerHTML;
		dname.value = list[1].innerHTML;
		dloc.value = list[2].innerHTML;
	}
	
	function update() {
		document.getElementById("op").value = "update";
		document.F.submit();
	}
	
	function del() {
		document.getElementById("op").value = "delete";
		document.F.submit();
	}
</script>
</head>
<body>
	<h2>부서관리</h2>
	<%
		String method = request.getMethod();
		// getMethod()는 대문자를 반환한다.
	
		DeptDao dao = new DeptDao();
		if (method.equals("POST")) {
			request.setCharacterEncoding("euc-kr");
			int dno = Integer.parseInt(request.getParameter("dno"));
			String dname = request.getParameter("dname");
			String dloc = request.getParameter("dloc");
			
			DeptVo d = new DeptVo(dno, dname, dloc);
			
			String oper = request.getParameter("op");
			
			if (oper.equals("insert")) {
				dao.insertDept(d);
			} else if (oper.equals("update")) {
				dao.updateDept(d);
			} else if (oper.equals("delete")) { // 테이블을 삭제하기 위해서는 참조가 되어 있는 테이블들은 참조 튜플이 귀속되어 있기 때문에 삭제가 불가 = 참조무결성   
				dao.deleteDept(dno);
			}
		}
		ArrayList<DeptVo> list = dao.listAll();
	%>

	<form name="F" action="deptTest.jsp" method="post"> <!-- method의 형태(get, post 등)를 설정할 때는 대소문자를 구별하지 않으나 request.getMethod()는 대문자를 반환한다. -->
		<input type="hidden" name="op" id="op" value="insert"> <!-- name은 java이고 id는 JavaScript에 필요하다 -->
		부서번호 : <input type="number" name="dno" id="dno"><br>
		부서명 : <input type="text" name="dname" id="dname"><br>
		부서위치 : <input type="text" name="dloc" id="dloc"><br>
		<input type="submit" value="등록">
		<input type="button" value="수정" onclick="update()">
		<input type="button" value="삭제" onclick="del()">
	</form>

	<table border="1" width="80%">
		<tr>
			<td>부서번호</td>
			<td>부서명</td>
			<td>부서위치</td>
		</tr>
		<%
			for (DeptVo d : list) {
		%>
		<tr class="tdlist" onclick="pro(this)"><td><%=d.getDno()%></td><td><%=d.getDname()%></td><td><%=d.getDloc()%></td></tr>
		<%
			}
		%>
	</table>
</body>
</html>