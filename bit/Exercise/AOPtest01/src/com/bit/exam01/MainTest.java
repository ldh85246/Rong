package com.bit.exam01;

import com.bit.dao.BoardDao;
import com.bit.dao.MemberDao;

public class MainTest {

	public static void main(String[] args) {
		BoardDao bDao = new BoardDao();
		bDao.deleteBoard(10);
		
		MemberDao mDao = new MemberDao();
		mDao.insertMember("");
		mDao.updateMember("");
	}

}
