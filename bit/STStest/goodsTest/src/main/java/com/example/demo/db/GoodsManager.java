package com.example.demo.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.GoodsVo;

public class GoodsManager {
	private static SqlSessionFactory factory;
	
	static {
		try {
			Reader reader = 
					Resources.getResourceAsReader("com/example/demo/db/SqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static List<GoodsVo> listAll(HashMap map) {
		SqlSession session = factory.openSession();
		List<GoodsVo> list = session.selectList("goods.selectAll", map);
		session.close();
		return list;
	}
	
	public static int totalRecord() {
		int cnt = 0;
		SqlSession session = factory.openSession(true);
		session.close();
		return cnt;
	}
	
	public static int insertGoods(GoodsVo g) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.insert("goods.insert", g);
//		session.commit();
		session.close();
		return re;
	}
	
	public static GoodsVo getGoods(int no) {
		SqlSession session = factory.openSession();
		GoodsVo g = session.selectOne("goods.getGoods", no);
		session.close();
		return g;
	}
	
	public static int updateGoods(GoodsVo g) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.update("goods.update", g);
		session.close();
		return re;
	}
	
	public static int deleteGoods(int no) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.delete("goods.delete", no);
		session.close();
		return re;
	}
}
