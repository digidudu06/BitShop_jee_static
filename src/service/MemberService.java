package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void join();
	public ArrayList<MemberBean> findAll();
	public ArrayList<MemberBean> findByName();
	public MemberBean findById();
	public int countMember();
	public boolean login();
	public void updatePass();
	public void deleteMember();
}
