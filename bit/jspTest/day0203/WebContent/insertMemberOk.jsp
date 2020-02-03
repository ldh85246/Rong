<%@page import="com.bit.dao.MemberDao"%>
<%@page import="com.bit.vo.MemberVo"%>
<%@page import="java.util.Arrays"%>
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
		// 사용자가 요청한 데이터는 한글입니다를 설정
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String bloodType = request.getParameter("bloodType");
		String[] hobby = request.getParameterValues("hobby");
		String url = request.getParameter("url");
		String job = request.getParameter("job");
		String intro = request.getParameter("intro");
		String hobbys = Arrays.toString(hobby);
	%>
입력정보는 다음과 같습니다.<br>
아이디 : <%= id %><br>
암호 : <%= pwd %><br>
이름 : <%= name %><br>
전화번호 : <%= tel %><br>
생일 : <%= birth %><br>
이메일 : <%= email %><br>
성별 : <%= gender %><br>
혈액형 : <%= bloodType %><br>
취미 : 
<%
	hobbys = Arrays.toString(hobby);
/*
		for (String s : hobby) {
			hobbys = hobbys + s + ",";
			}
*/
%>
<%= hobbys %><br>
url : <%= url %><br>
직업 : <%= job %><br>
자기소개 : <%= intro %><br>
<%
MemberVo m = new MemberVo(id, pwd, name, tel, birth, email, gender, bloodType, hobbys, url, job, intro);
MemberDao dao = new MemberDao();
int re = dao.insertMember(m);

if (re > 0) {
	out.print("<font color='blue'>회원가입 완료되었습니다.</font>");
} else {
	out.print("<font color='red'>회원가입에 실패하였습니다.</font>");
}
%>
</body>
</html>