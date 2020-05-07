package com.bit.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.dao.BoardDao;
import com.bit.dao.MemberDao;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam01/beans.xml");
		
		BoardDao bDao = (BoardDao)context.getBean("bDao");
		bDao.deleteBoard(10);
		
		MemberDao mDao = (MemberDao)context.getBean("mDao");
		mDao.insertMember("이순신");
		mDao.updateMember("유관순");
	}
}
