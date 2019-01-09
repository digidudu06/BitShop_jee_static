package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {
	public void createArticle(ArticleBean article);
	
	public ArrayList<ArticleBean> findAllArticles();
	public ArrayList<ArticleBean> findArticlesByTitle(String title);
	public ArticleBean findArticleBySeq(String seq);
	public int countArticles();
	public boolean existArticle(String title);
	
	public void modifyArticle(ArticleBean article);
	
	public void deleteArticle(String id, String pass);

}
