package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.MemberDao;

/**
 * Servlet implementation class signInServlet
 */
@WebServlet("/signIn.do")
public class signInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String str = "";
		str += "<html>";
		str += "<form method='post' action='signIn.do'>";
		str += "아이디 : <input type='text' name='id'><br>";
		str += "암호 : <input type='password' name='pwd'><br>";
		str += "<input type='submit' value='확인'>";
		str += "<input type='reset' value='취소'>";
		str += "</form>";
		str += "</html>";
		out.print(str);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		MemberDao dao = new MemberDao();
		if (dao.isMember(id, pwd)) {
			request.getSession().setAttribute("id", id);
			response.sendRedirect("listGoods.do");
		} else {
			response.sendRedirect("signIn.do");
		}
	}
}
