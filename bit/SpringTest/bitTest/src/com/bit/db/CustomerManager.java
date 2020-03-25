package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.CustomerVo;

public class CustomerManager {
	
	// 객체 생성하지 않고 사용하기 위해 static 키워드 사용
	private static SqlSessionFactory factory;
	
	// 객체없이 동작하도록 하기 위해 static 블락을 이용해서 factory 초기화 구문 추가
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml");
			
			// SqlSessionFactoryBuilder의 메소드 중 build 메소드에 reader를 이용해서 factory 초기화
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static List<CustomerVo> listAll(HashMap map) {
		// mapping 파일의 sql을 얻어오기
		SqlSession session = factory.openSession();
		List<CustomerVo> list = session.selectList("customer.selectAll", map);
		// mapping 파일의 id로 쿼리수행 후 결과를 list에 담음 
		
		session.close();
		return list;
	}
	
	public static CustomerVo getCustomer(int custid) {
		SqlSession session = factory.openSession();
		CustomerVo cv = session.selectOne("customer.selectCustomer", custid);
		session.close();
		return cv;
	}
	
	public static int insertCustomer(CustomerVo c) {
		int re = -1;
		SqlSession session = factory.openSession();
		re = session.insert("customer.insert", c);
		session.commit();
		session.close();
		return re;
	}
	
    public static int deleteCustomer(int custid) {
        int re = -1;
        SqlSession session = factory.openSession(true);
        re = session.delete("customer.delete", custid);
//      session.commit();
        session.close();
        return re;
    }
    
    public static int update(CustomerVo c) {
        int re = -1;
        SqlSession session = factory.openSession(true);
        re = session.update("customer.update", c);
        session.close();
        return re;
    }
}
