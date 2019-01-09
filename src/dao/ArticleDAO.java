package dao;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleDAO {
	public void insertArticle(ArticleBean article);
	
	public ArrayList<ArticleBean> selectAllArticles();
	public ArrayList<ArticleBean> selectArticlesByTitle(String title);
	public ArticleBean selectArticleBySeq(String seq);
	public int countArticles();
	
	public void updateArticle(ArticleBean article);
	
	public void deleteArticle(String id, String pass);
}
