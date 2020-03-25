package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.GoodsVo;

public class GoodsManager {
	public static SqlSessionFactory factory;
	// sql 상태유지 공장을 생성
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();	// io는 항상 닫아주는 것을 기억!
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static List<GoodsVo> listAll() {
		// static을 사용하는 가장 결정적인 이유는? 객체없이 사용하려고!
		
		List<GoodsVo> list = null;
		SqlSession session = factory.openSession();
		// session은 공장의 열쇠같은 개념
		
		list = session.selectList("goods.selectAll");
		session.close();
		return list;
	}
}
