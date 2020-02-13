package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.GoodsDao;
import com.bit.vo.GoodsVo;

/**
 * Servlet implementation class listGoodsServlet
 */
@WebServlet("/listGoods.do")
public class listGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("id") == null) {
			response.sendRedirect("signIn.do");
		}
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		GoodsDao dao = new GoodsDao();
		ArrayList<GoodsVo> list = dao.listAll();
		out.print("<h2>상품목록</h2>");
		out.print("<a href='insertGoods.do'>상품등록</a>");
		String str = "<table border='1' width='80%'>";
		str += "<tr>";
		str += "<td>상품번호</td>";
		str += "<td>상품명</td>";
		str += "<td>가격</td>";
		str += "<td>수량</td>";
		str += "<td>사진</td>";
		str += "</tr>";
		
		for (GoodsVo g : list) {
			str += "<tr>";
			str += "<td>" + g.getNo() + "</td>";
			str += "<td><a href='detailGoods.do?no=" + g.getNo() + "'>" + g.getItem() + "</a></td>";
			str += "<td>" + g.getItem() + "</td>";
			str += "<td>" + g.getPrice() + "</td>";
			str += "<td>" + g.getQty() + "</td>";
			str += "<td><img src='upload/" + g.getFname() + "' width='50' height='50'></td>";
			str += "</tr>";
		}
		str += "</table>";
		out.print(str);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
