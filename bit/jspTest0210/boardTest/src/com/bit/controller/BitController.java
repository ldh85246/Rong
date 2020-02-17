package com.bit.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.action.BitAction;
import com.bit.action.DeleteBoardAction;
import com.bit.action.DeleteBoardOkAction;
import com.bit.action.DetailBoardAction;
import com.bit.action.InsertBoardAction;
import com.bit.action.InsertBoardOkAction;
import com.bit.action.ListBoardAction;

/**
 * Servlet implementation class BitController
 */
@WebServlet("*.do")
public class BitController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 사용자의 요청별 일처리 담당자를 map에 등록해 둡시다.
	HashMap<String, BitAction> map = new HashMap<String, BitAction>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BitController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		// super.init(config);

		String path = config.getServletContext().getRealPath("WEB-INF");
		try {
			FileReader fr = new FileReader(path + "/bit.properties");
			Properties prop = new Properties();
			prop.load(fr);
			Set set = prop.keySet();
			Iterator iter = set.iterator();
			while (iter.hasNext()) {
				String key = (String) iter.next();
				String clsName = (String) prop.get(key);

				map.put(key, (BitAction) Class.forName(clsName).newInstance());
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		// super.init();

		// map에 사용자의 요청별 일처리 담당자 객체를 생성하여 담아요.
		/*
		 * map.put("/insertBoard.do", new InsertBoardAction());
		 * map.put("/insertBoardOk.do", new InsertBoardOkAction());
		 * map.put("/listBoard.do", new ListBoardAction()); map.put("/detailBoard.do",
		 * new DetailBoardAction()); map.put("/deleteBoard.do", new
		 * DeleteBoardAction()); map.put("/deleteBoardOk.do", new
		 * DeleteBoardOkAction());
		 */
	}

	// doGet, doPost로 요청이 들어왔을 때 처리해주는 메소드
	public void proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request에 들어있는 사용자가 요청한 uri를 사용

//		String url = request.getRequestURL().toString();
		String uri = request.getRequestURI();
		// url http://localhost:8080/day0213/insertBoard.do 전체 주소
		// uri /day0213/insertBoard.do 콘텍스트 주소부터 요청명까지

		String cmd = uri.substring(uri.lastIndexOf("/")); // uri의 '/' 문자를 마지막부터 찾아서 인덱스를 반환. uri의 '/' 인덱스부터 마지막 문자까지
		String view = "";
		BitAction action = map.get(cmd);
		view = action.proRequest(request, response);
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		proRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		proRequest(request, response);
	}
}
