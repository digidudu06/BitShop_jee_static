package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.catalina.tribes.Member;

import domain.MemberBean;
import factory.Database;
import factory.DatabaseFactory;
import pool.Constant;

public class MemberDAOImpl implements MemberDAO {
	//데이터 베이스랑 연결하기 위해 //값이 사라지는 것을 방지
	private static MemberDAOImpl instance = new MemberDAOImpl();
	private ArrayList<MemberBean> list;
	private MemberDAOImpl() {
		list = new ArrayList<>();
	}
	public static MemberDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	@Override
	public void insertMember(MemberBean member) {
		try {
//			rs = stmt.executeQuery(sql);	//select에서 사용
			int rs = DatabaseFactory.createDatabase("oracle").getConnection()
				.createStatement().executeUpdate(
						String.format("INSERT INTO member(id, name, pass, ssn)\r\n" + 
							"VALUES('%s', '%s', '%s', '%s')",
								member.getId(), member.getName(), member.getPass(), member.getSsn()));	//insert...에서 사용
			if(rs==1) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<MemberBean> selectMembersByName(String name) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
//				list.add(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = null;	//없는 경우에 생tjdX 
		try {
			//SQL 진영
			ResultSet rs = DatabaseFactory
				.createDatabase("oracle")
				.getConnection()
				.createStatement()
				.executeQuery(
						String.format("SELECT * FROM member\n" + 
						"WHERE id LIKE '%s'", id));
			while(rs.next()) {
				//Java 진영
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return member;
	}

	@Override
	public int countMembers() {
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
	public void updatePass(MemberBean member) {
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
	public void deleteMember(String id, String pass) {
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
