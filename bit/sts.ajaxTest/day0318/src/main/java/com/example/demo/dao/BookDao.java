package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.BookManager;
import com.example.demo.vo.BookVo;

@Repository
public class BookDao {
	public List<BookVo> listAll() {
		return BookManager.listAll();
	}

	public int insert(BookVo b) {
		return BookManager.insert(b);
	}

	public int update(BookVo b) {
		return BookManager.update(b);	
	}

	public int delete(BookVo b) {
		return BookManager.delete(b);
	}
}
