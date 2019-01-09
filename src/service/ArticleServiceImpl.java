package service;

import java.util.ArrayList;

import dao.ArticleDAOImpl;
import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService {
	private static ArticleServiceImpl instance = new ArticleServiceImpl();
	public ArticleDAOImpl dao;
	private ArticleServiceImpl() {
		dao = ArticleDAOImpl.getInstance();
	}
	public static ArticleServiceImpl getInstance() {return instance;}

	@Override
	public void createArticle(ArticleBean article) {
		dao.insertArticle(article);
	}

	@Override
	public ArrayList<ArticleBean> findAllArticles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ArticleBean> findArticlesByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean findArticleBySeq(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countArticles() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existArticle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyArticle(ArticleBean article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteArticle(String id, String pass) {
		// TODO Auto-generated method stub
		
	}

}
