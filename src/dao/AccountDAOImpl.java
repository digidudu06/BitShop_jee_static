package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;

public class AccountDAOImpl implements AccountDAO {
	private static AccountDAOImpl instance = new AccountDAOImpl();
	private ArrayList<AccountBean> list;
	private AccountDAOImpl() {
		list = new ArrayList<>();
	}
	public static AccountDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	@Override
	public void insertAccount(AccountBean account) {		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format(
					"INSERT INTO account(accountNum, money, today)\r\n" + 
					"VALUES('%s', '%d', '%s')", 
					account.getAccountNum(), account.getMoney(), account.getToday());
			System.out.println("sql ::: "+sql);
			
			if(stmt.executeUpdate(sql)==1){
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<AccountBean> selectAllAccont() {
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
	public AccountBean selectAccountByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
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
		return account;
	}

	@Override
	public int countAccountNum() {
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
	public void deposit(String account, int money) {
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
	public void withdraw(String account, int money) {
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
	public void deleteAccount(String accountNum) {
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
