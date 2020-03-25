package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.BookVo;

@Repository
public class BookDao {
	
	public List<BookVo> listBook() {
		return DBManager.listBook();
	}
	
	public BookVo detail(int bookid) {
		return DBManager.getBook(bookid);
	}
	
	public int insert(BookVo b) {
		return DBManager.insertBook(b);
	}
	
	public int delete(int bookid) {
		return DBManager.deleteBook(bookid);
	}
}
