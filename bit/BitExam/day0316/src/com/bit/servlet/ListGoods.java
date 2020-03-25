package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.GoodsDao;
import com.google.gson.Gson;

/**
 * Servlet implementation class ListGoods
 */
@WebServlet("/ListGoods")
public class ListGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListGoods() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("서블릿 동작함");
		response.setContentType("application/json; charset=UTF-8");	// 받은 데이터를 객체 형태의 json으로 세팅 
		PrintWriter out = response.getWriter();		// HttpServlet을 받아서 나가도록 선언만
		String str = "";
		Gson gson = new Gson();
		GoodsDao dao = new GoodsDao();
		str = gson.toJson(dao.listAll());			// list를 gson형태로 변경 요청
		System.out.println(str);
		out.write(str);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}