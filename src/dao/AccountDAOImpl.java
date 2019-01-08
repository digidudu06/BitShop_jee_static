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
	private AccountDAOImpl() {}
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
	public String createAccountNum() {
		return null;
	}

	@Override
	public ArrayList<AccountBean> findAll() {
		return null;
	}

	@Override
	public AccountBean findByAccount(String accountNum) {
		return null;
	}

	@Override
	public int countAccountNum() {
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		return false;
	}

	@Override
	public String today() {
		return null;
	}

	@Override
	public void deposit(String account, int money) {
		
	}

	@Override
	public void withdraw(String account, int money) {
		
	}

	@Override
	public void deleteAccount(String accountNum) {
		
	}

}
