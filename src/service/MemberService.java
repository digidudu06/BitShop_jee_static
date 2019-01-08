package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void joinMember(MemberBean member);
	
	public ArrayList<MemberBean> findAll();
	public ArrayList<MemberBean> findByName(String name);
	public MemberBean findById(String id);
	public int countMembers();
	public boolean login(String id, String pass);
	
	public void updatePass(String id, String pass, String newPass);
	
	public void deleteMember(String id, String pass);
}
