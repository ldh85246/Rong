package com.bit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dao.GoodsDao;
import com.bit.vo.GoodsVo;

/**
 * Servlet implementation class insertGoodsServlet
 */
@WebServlet("/updateGoods.do")
public class updateGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
//		response.setCharacterEncoding("utf-8");
		int no = Integer.parseInt(request.getParameter("no"));
		GoodsDao dao = new GoodsDao();
		GoodsVo g = dao.getGoods(no);
		PrintWriter out = response.getWriter();
		String str = "<html>";
		str += "<h2>상품수정</h2>";
		str += "<form method = 'post' action='updateGoodsOk.do' enctype='multipart/form-data'>";
		str += "상품명";
		str += "<input type='text' name='item' value='" + g.getItem() + "'><br>";
		str += "가격";
		str += "<input type='number' name='price' value='" + g.getPrice() + "'><br>";
		str += "수량";
		str += "<input type='number' name='qty' value='" + g.getQty() + "'><br>";
		str += "파일";
		str += "<img src='upload/" + g.getFname() + "' width='20' height='20'>";
		str += "<input type='file' name='fname'><br>";
		str += "상품상세<br>";
		str += "<textarea name='detail'>"+g.getDetail()+"</textarea><br>";
		str += "<input type='submit' value='수정'";
		str += "<input type='reset' value='취소'";
		str += "</form>";
		str += "</html>";
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
