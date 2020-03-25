package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.MemberVo;
import com.example.demo.vo.StockVo;

public class DBManager {
	
	private static SqlSessionFactory factory;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static MemberVo signIn(String mem_id) {
		SqlSession session = factory.openSession();
		MemberVo m = session.selectOne("member.signIn", mem_id);
		return m;
	}
	
	public static List<StockVo> listStock() {
		SqlSession session = factory.openSession();
		List<StockVo> list = session.selectList("stock.selectStock");
		return list;
	}
	
	public static StockVo detailStock(int stock_no) {
		SqlSession session = factory.openSession();
		StockVo s = session.selectOne("stock.detailStock", stock_no);
		return s;
	}
}
