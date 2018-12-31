package service;

import java.util.ArrayList;

import domain.ArticleBean;


public interface ArticleService {
	public void create();
	public ArrayList<ArticleBean> findAll();
	public ArrayList<ArticleBean> findSome();
	public ArticleBean findOne();
	public int count();
	public boolean exist();
	public void update();
	public void delete();

}
