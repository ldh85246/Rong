package com.bit.exam07;

public class WriteArticleServiceImpl {
	private ArticleDao articleDao;

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	public void pro() {
		articleDao.insert();
	}
}
