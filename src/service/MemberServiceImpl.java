package service;

import java.util.ArrayList;

import domain.MemberBean;

public class MemberServiceImpl implements MemberService{

	@Override
	public void join(String name, String id, String pass, String ssn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<MemberBean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMembers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(String id, String pass) {
		// TODO Auto-generated method stub
		return false;
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
