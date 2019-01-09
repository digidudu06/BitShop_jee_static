package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AdminBean;
import service.AdminService;

public class AdminDAOImpl implements AdminDAO {
	private static AdminDAOImpl instance = new AdminDAOImpl();
	private ArrayList<AdminBean> list;
	private AdminDAOImpl() {
		list = new ArrayList<>();
	}
	public static AdminDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	@Override
	public void insertAdmin(AdminBean admin) {
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
	public ArrayList<AdminBean> selectAllAdmins() {
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
	public ArrayList<AdminBean> selectAdminsByAuth(String Auth) {
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
	public AdminBean selectAdminByAdminNum(String adminNum) {
		AdminBean admin = new AdminBean();
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
		return admin;
	}

	@Override
	public int countAdmins() {
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
	public void updateAdmin(AdminBean admin) {
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
	public void deleteAdmin(String adminNum, String pass) {
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
