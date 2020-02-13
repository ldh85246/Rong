package com.bit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.GoodsDao;

/**
 * Servlet implementation class ListGoodsServlet
 */
@WebServlet("/goods/listGoods.do")
public class ListGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pageNUM = 1;
		String pageStr = "";
		if(request.getParameter("pageNUM") != null) {
			pageNUM = Integer.parseInt(request.getParameter("pageNUM"));
		}
		
		System.out.println("페이지번호:"+pageNUM);
		int startPage = (((pageNUM - 1) / GoodsDao.pageGroup) * GoodsDao.pageGroup + 1);
		//현재페이지 - 1(1부터 시작해야 하므로. 0~4가 한 화면당 페이지 수) * 한 화면당 페이지 수 + 1(0부터 시작하므로)
		int endPage = startPage + GoodsDao.pageGroup - 1;
		if(endPage > GoodsDao.totalPage) {
			endPage = GoodsDao.totalPage;
		}
		String view = "/goods/listGoods.jsp";
		GoodsDao dao = new GoodsDao();
		
		if(startPage > 1) {
			pageStr = "<a href='listGoods.do?pageNUM=" + (startPage - 1) + "'>[이전]</a>";
		}
		for(int i = startPage; i <= endPage; i++) {
			pageStr += "<a href='listGoods.do?pageNUM=" + i + "'>" + i + "</a>&nbsp;&nbsp;&nbsp;";	//a 태그 안에 넣으면 블랭크문자까지 포함될 수 있어 태그 밖으로 뺌.
		}
		if(endPage < GoodsDao.totalPage) {
			pageStr += "<a href='listGoods.do?pageNUM=" + (endPage + 1) + "'>[다음]</a>";
		}
		
		System.out.println(pageStr);
		request.setAttribute("list", dao.listAll(pageNUM));
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage",	endPage);
		request.setAttribute("totalPage", GoodsDao.totalPage);
		request.setAttribute("pageStr", pageStr);
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

