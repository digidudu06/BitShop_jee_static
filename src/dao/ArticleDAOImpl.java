package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;
import domain.ArticleBean;

public class ArticleDAOImpl implements ArticleDAO {
	private static ArticleDAOImpl instance = new ArticleDAOImpl();
	private ArrayList<ArticleBean> list;
	private ArticleDAOImpl() {
		list = new ArrayList<>();
	}
	public static ArticleDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	@Override
	public void insertArticle(ArticleBean article) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			if(stmt.executeUpdate(sql)==1) {
				
			}else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<ArticleBean> selectAllArticles() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			while(stmt.executeQuery(sql).next()){
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<ArticleBean> selectArticlesByTitle(String title) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			while(stmt.executeQuery(sql).next()){
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArticleBean selectArticleBySeq(String seq) {
		ArticleBean article = new ArticleBean();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			while(stmt.executeQuery(sql).next()) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return article;
	}

	@Override
	public int countArticles() {
		int count = 0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			if(stmt.executeUpdate(sql)==1) {
				
			}else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void updateArticle(ArticleBean article) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			if(stmt.executeUpdate(sql)==1) {
				
			}else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteArticle(String id, String pass) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			if(stmt.executeUpdate(sql)==1) {
				
			}else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
