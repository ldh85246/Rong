package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.bit.db.ConnectionProvider;
import com.bit.vo.DeptVo;

public class DeptDao {
	// 고객별 총구매건수와 총구매액, 평균구매액을 반환하는 메소드
	// 단, 총구매액이 높은순으로 출력
	public ArrayList<Map<String, String>> listOrdersByCustomer() {
		ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
		String sql = "select name, count(*) as 총구매건수, " + 
				"sum(saleprice) as 총구매액, " +
				"round(avg(saleprice),0) as 평균구매액 " + 
				"from customer c, orders o " +
				"where c.custid = o.custid " +
				"group by name order by sum(saleprice) desc";
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, String> map = new HashMap<String, String>();
//				map.put("name", rs.getString(1));
				map.put("name", rs.getString("NAME"));
				map.put("cnt", rs.getString("총구매건수"));
				map.put("tot", rs.getString("총구매액"));
				map.put("avg", rs.getString("평균구매액"));
				// index로도 접근할 수 있고, 컬럼으로도 접근할 수 있다.
				
				list.add(map);
			}
			ConnectionProvider.close(rs, stmt, conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return list;
	}
	
	// 다음 부서번호를 생성하여 반환하는 메소드
	public int getNextDno() {
		int dno = 0;
		String sql = "select max(dno) + 100 from dept";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				dno = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dno;
	}

	public int insertDept(DeptVo d) {
		int re = -1;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang");
			String sql = "insert into dept values(?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, d.getDno());
			pstmt.setString(2, d.getDname());
			pstmt.setString(3, d.getDloc());
			re = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return re;
	}
}
