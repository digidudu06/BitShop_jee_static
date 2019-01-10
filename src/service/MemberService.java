package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void createMember(MemberBean member);
	
	public ArrayList<MemberBean> findAllMembers();
	public ArrayList<MemberBean> findMembersByName(String name);
	public MemberBean findMemberById(String id);
	public int countMembers();
	public boolean existMember(String id, String pass);
	
	public void modifyMember(MemberBean member);
	
	public void removeMember(String id, String pass);
}
