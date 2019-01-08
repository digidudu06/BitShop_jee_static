package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {
	public void insertMember(MemberBean member);
	public ArrayList<MemberBean> selectMembers();
	public ArrayList<MemberBean> selectByName(String name);
	public MemberBean selectById(String id);
	public int countMembers();
	public void updatePass(String id, String pass, String newPass);
	public void deleteMember(String id, String pass);
}
