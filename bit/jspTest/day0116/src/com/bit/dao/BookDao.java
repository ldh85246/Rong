package com.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bit.db.ConnectionProvider;
import com.bit.vo.BookVo;

public class BookDao {
//	public ArrayList<BookVo> listSearch(String keyword) {
//		ArrayList<BookVo> list = new ArrayList<BookVo>();
//		try {
//			String sql = "select publisher from book where publisher = ";
//			if (keyword != null) {
//				sql = sql + "where publisher like '%" + keyword + "%'";
//			}
//			Connection conn = ConnectionProvider.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, keyword);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				list.add(new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
//			}
//			ConnectionProvider.close(rs, pstmt, conn);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return list;
//	}

	public ArrayList<BookVo> listAll(String sortField, String keyword) {
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		try {
			String sql = "select * from book ";

			if (keyword != null) {
//				sql = sql + "where publisher = '" + keyword + "'";
				sql = sql + "where publisher like '%" + keyword + "%'";
			}

			if (sortField != null) {
				sql = sql + " order by " + sortField;
			}
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}

	public List<BookVo> listRecommend(String name) {
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		String sql = "select bookid, bookname, publisher, price from book " + "where bookid in "
				+ "(select bookid from orders where custid in " + "(select custid from "
				+ "(select rownum n, custid, cnt from " + "(select c.custid, count(*) cnt from customer c, orders o, "
				+ "(select bookid from orders where custid = " + "(select custid from customer where name=?)) list "
				+ "where c.custid = o.custid and " + "o.bookid = list.bookid and " + "name != ? " + "group by c.custid "
				+ "order by count(*) desc)) " + "where cnt >= " + "(select cnt from "
				+ "(select rownum n, custid, cnt from " + "(select c.custid, count(*) cnt from customer c, orders o, "
				+ "(select bookid from orders where custid = " + "(select custid from customer where name=?)) list "
				+ "where c.custid = o.custid and " + "o.bookid = list.bookid and " + "name != ? " + "group by c.custid "
				+ "order by count(*) desc)) " + "where n = 1)) " + "minus "
				+ "select bookid from orders where custid = " + "(select custid from customer where name = ?))";

		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, name);
			pstmt.setString(3, name);
			pstmt.setString(4, name);
			pstmt.setString(5, name);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			ConnectionProvider.close(rs, pstmt, conn);

			// list.addAll(listBest3());
			// 동일한 도서가 추천될수도 있을것 같아요!
			if (list.size() < 3) {
				ArrayList<BookVo> list2 = (ArrayList<BookVo>) listBest3(name);

				// list2에서 list에 동일한 항목을 제거
				list2.removeAll(list);

				// list에 동일한 도서가 제거된 list2를 담는다.
				list.addAll(list2);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list.subList(0, 3);
	}

	private ArrayList<BookVo> listBest3(String name) {
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		String sql = "select * from book where bookid in " + "(select bookid from " + "(select b.bookid, count(*) from "
				+ "(select bookid from book " + "minus " + "select bookid from orders o, customer c "
				+ "where o.custid = c.custid and name = ?) b left outer join orders o "
				+ "on b.bookid = o.bookid group by b.bookid order by count(*) desc) " + "where rownum <= 3)";

		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			ConnectionProvider.close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}