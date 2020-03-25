package com.example.demo.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.EmpViewVo;
import com.example.demo.vo.EmpVo;

public class EmpManager {
	
	private static SqlSessionFactory factory;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/SqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static List<EmpVo> managerList() {
		SqlSession session = factory.openSession();
		List<EmpVo> list = session.selectList("emp.managerList");
		session.close();
		return list;
	}
	
	public static int insert(EmpVo e) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.insert("emp.insert", e);
		session.close();
		return re;
	}
	
    public static List<EmpViewVo> listEmpView(HashMap map){
        List<EmpViewVo> list = null;
        SqlSession session = factory.openSession();
        list = session.selectList("emp.listEmpView", map);
        session.close();
        return list;
    }
}
