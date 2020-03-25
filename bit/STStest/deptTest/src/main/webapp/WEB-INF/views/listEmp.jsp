<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사원목록</h2>
	<hr>
	<form action="listEmp.do">
		<select name="searchColumn">
			<option value="mname">관리자명</option>
			<option value="job">직책</option>
			<option value="dloc">부서위치</option>
			<option value="dname">부서명</option>
		</select>
		<input type="text" name="keyword">
		<input type="submit" value="검색">
	</form>
	<table border="1" width="80%">
		<tr>
			<td>사원번호</td>
			<td>사원명</td>
			<td>부서명</td>
			<td>직책</td>
			<td>관리자명</td>
			<td>급여</td>
			<td>수당</td>
			<td>실수령액</td>
			<td>부서위치</td>
			<td>입사일</td>
		</tr>
		
		<c:forEach var="e" items="${list }">
			<tr>
				<td>${e.eno }</td>				
				<td>${e.ename }</td>				
				<td>${e.dname }</td>				
				<td>${e.job }</td>				
				<td>${e.mname }</td>				
				<td>${e.sal }</td>				
				<td>${e.comm }</td>				
				<td>${e.total }</td>				
				<td>${e.dloc }</td>				
				<td>${e.hiredate }</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>
