package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;

public class MemberDAOImpl implements MemberDAO {
	//데이터 베이스랑 연결하기 위해 //값이 사라지는 것을 방지
	private static MemberDAOImpl instance = new MemberDAOImpl();
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	@Override
	public void insertMember(MemberBean member) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format(
					"INSERT INTO member(id, name, pass, ssn)\r\n" + 
					"VALUES('%s', '%s', '%s', '%s')",
					member.getId(), member.getName(), member.getPass(), member.getSsn());
			System.out.println("SQL ::: "+sql);
//			rs = stmt.executeQuery(sql);	//select에서 사용
			if(stmt.executeUpdate(sql)==1){	//insert...에서 사용
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<MemberBean> selectMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMembers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updatePass(String id, String pass, String newPass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(String id, String pass) {
		// TODO Auto-generated method stub
		
	}

}
