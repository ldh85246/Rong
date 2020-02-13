package com.bit.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertBoardAction implements BitAction {

	@Override
	public String proRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int no = 0;
		String head = "�����ۼ�";
		if (request.getParameter("no") != null) {
			no = Integer.parseInt(request.getParameter("no"));
			head = "����ۼ�";
		}
		request.setAttribute("no", no);
		request.setAttribute("head", head);
		return "insertBoard.jsp";
	}
}