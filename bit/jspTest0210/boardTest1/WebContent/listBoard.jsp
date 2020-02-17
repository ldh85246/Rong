<%@page import="com.bit.vo.BoardVo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style type="text/css">
	*{
		margin: 0px;
		padding: 0px;
	}

	#title{
		position: fixed;
		z-index: 100;
		background: white;
		width: 100%;
		height: 300px;
	}
	
	#bitcamp{
		display: block;		
		left: 1000px;
	}
	
	#list{
		position:absolute;
		top: 300px;
		
	}
</style>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="title">
	<h2>게시물 목록</h2>
	<hr>
	<a id="bitcamp" href="https://bitcamp.co.kr"><img src="bitcamp.png"></a>
	<a href="insertBoard.do">새글등록</a><br>
	
	<table id="thead"  class="table table-hover">
		<tr >
			<td width="50px">글번호</td>
			<td width="200px">글제목</td>
			<td width="50px">작성자</td>
			<td width="50px">조회수</td>
			<td width="100px">등록일</td>
			<td width="100px">ip주소</td>
		</tr>
	</table>
	</div>
	<table id="list"  class="table table-hover">	
		
		<c:forEach var="b" items="${list }">
			<tr>
				<td width="50px">${b.no }</td>
				<td width="200px">
					<c:if test="${b.b_level > 0 }">
						<c:forEach begin="1" end="${b.b_level }">
							&nbsp;&nbsp;
						</c:forEach>
						<font color='red'>-></font>
						<!-- <img src="re.png"> -->
					</c:if>
				
					<a class="title" href="detailBoard.do?no=${b.no }">${b.title }</a> 
				</td>
				<td width="50px">${b.writer }</td>
				<td width="50px">${b.hit }</td>
				<td width="100px">${b.regdate }</td>
				<td width="100px">${b.ip }</td>
			</tr>
		</c:forEach>
		
	</table>
	
	
	<c:if test="${startPage > 1 }">
		<a href="listBoard.do?pageNUM=${startPage-1 }">이전</a>
	</c:if>
	
	<c:forEach var="i" begin="${startPage}" end="${endPage }">
		<a href="listBoard.do?pageNUM=${i }">${i }</a>
	</c:forEach>
	
	<c:if test="${endPage < totalPage }">
		<a href="listBoard.do?pageNUM=${endPage+1 }">다음</a>
	</c:if>
	
</body>
</html>



















