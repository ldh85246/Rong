package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.MemberDao;
import com.bit.vo.MemberVo;

/**
 * Servlet implementation class insertMember
 */
@WebServlet("/insertMember.do")
public class insertMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public insertMemberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String str = "";
		str += "<html>";
		str += "<h2>회원가입</h2>";
		str += "<form method='post' action='insertMember.do'>";
		str += "아이디:<input type='text' name='id'><br>";
		str += "암호:<input type='password' name='pwd'><br>";
		str += "이름:<input type='text' name='name'><br>";
		str += "전화:<input type='tel' name='tel' pattern='[0-9]{3}-[0-9]{4}-[0-9]{4}'><br>";
		str += "성별:<input type='radio' value='남자' name='gender'>남자 <input type='radio' value='여자' name='gender'>여자<br>";
		str += "생일:<input type='date' name='birth'><br>";
		str += "이메일:<input type='email' name='email'><br>";
		str += "혈액형:";
		str += "<input type='radio' name='bloodtype' value='A'>A형";
		str += "<input type='radio' name='bloodtype' value='B'>B형";
		str += "<input type='radio' name='bloodtype' value='AB'>AB형";
		str += "<input type='radio' name='bloodtype' value='O'>O형<br>";
		str += "취미:";
		str += "<input type='checkbox' name='hobby' value='독서'>독서";
		str += "<input type='checkbox' name='hobby' value='음악감상'>음악감상";
		str += "<input type='checkbox' name='hobby' value='게임'>게임";
		str += "<input type='checkbox' name='hobby' value='수영'>수영";
		str += "<input type='checkbox' name='hobby' value='마라톤'>마라톤";
		str += "<br>";

		str += "url:<input type='url' name='url'>";
		str += "<br>";

		str += "직업:";
		str += "<select name='job'>";
		str += "<option value='회사원'>회사원</option>";
		str += "<option value='대표이사'>대표이사</option>";
		str += "<option value='공무원'>공무원</option>";
		str += "<option value='변호사'>변호사</option>";
		str += "<option value='의사'>의사</option>";
		str += "<option value='학생'>학생</option>";
		str += "<option value='기타'>기타</option>";
		str += "</select>";
		str += "<br>";

		str += "자기소개:<br>";
		str += "<textarea rows='10' cols='80' name='intro'></textarea><br>";

		str += "<input type='submit' value='가입'>";
		str += "<input type='reset' value='취소'>";
		str += "</form>";
		str += "</html>";

		out.print(str);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		MemberVo m = new MemberVo();
		m.setId(request.getParameter("id"));
		m.setPwd(request.getParameter("pwd"));
		m.setName(request.getParameter("name"));
		m.setTel(request.getParameter("tel"));
		m.setGender(request.getParameter("gender"));
		m.setBirth(request.getParameter("birth"));
		m.setEmail(request.getParameter("email"));
		m.setBloodtype(request.getParameter("bloodtype"));
		m.setUrl(request.getParameter("url"));
		m.setJob(request.getParameter("job"));
		m.setIntro(request.getParameter("intro"));
		m.setHobby(Arrays.toString(request.getParameterValues("hobby")));

		MemberDao dao = new MemberDao();
		int re = dao.insertMember(m);
		String str = "회원가입 성공";
		if (re <= 0) {
			str = "회원가입 실패";
		}

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(str);
		out.close();
	}
}
