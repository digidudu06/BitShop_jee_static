package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {
	public void insertMember(MemberBean member);
	
	public ArrayList<MemberBean> selectAllMembers();
	public ArrayList<MemberBean> selectMembersByName(String name);
	public MemberBean selectMemberById(String id);
	public int countMembers();
	
	public void updatePass(MemberBean member);
	
	public void deleteMember(String id, String pass);
}
