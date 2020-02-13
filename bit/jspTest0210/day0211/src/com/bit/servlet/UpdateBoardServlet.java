package com.bit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.BoardDao;
import com.bit.vo.BoardVo;

/**
 * Servlet implementation class updateBoardServlet
 */
@WebServlet("/board/updateBoard.do")
public class UpdateBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao dao = new BoardDao();
		BoardVo b = dao.getBoard(no);
		request.setAttribute("b", b);
		RequestDispatcher dispatcher = request.getRequestDispatcher("updateBoard.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BoardVo b = new BoardVo();
		b.setNo(Integer.parseInt(request.getParameter("no")));
		b.setTitle(request.getParameter("title"));
		b.setContent(request.getParameter("content"));
		b.setFname(request.getParameter("fname"));

		BoardDao dao = new BoardDao();
		int re = dao.updateBoard(b);
		if (re > 0) {
			response.sendRedirect("listBoard.do");
		} else {
			request.setAttribute("msg", "게시물 수정에 실패하였습니다.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
	}

}
