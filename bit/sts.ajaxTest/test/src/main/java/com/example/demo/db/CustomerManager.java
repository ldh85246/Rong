package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.CustomerVo;

public class CustomerManager {
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
	
	public static int insertCustomer(CustomerVo c) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("customer.insert", c);
		session.commit();
		session.close();
		return re;
	}
	
	public static int updateCustomer(CustomerVo c) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.update("customer.update", c);
		session.commit();
		session.close();
		return re;
	}
	
	public static int deleteCustomer(int custid) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.delete("customer.delete", custid);
		session.commit();
		session.close();
		return re;
	}
	
	public static CustomerVo getCustomer(int custid) {
		SqlSession session = factory.openSession();
		CustomerVo cv = session.selectOne("customer.selectCustomer", custid);
		session.close();
		return cv;
	}
	
	public static List<CustomerVo> listAll() {
		SqlSession session = factory.openSession();
		List<CustomerVo> list = session.selectList("customer.selectAll");
		session.close();
		return list;
	}
}
