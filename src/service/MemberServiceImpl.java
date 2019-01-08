package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	//Controller와 연결해줌 
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private  MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {return instance;}

	@Override
	public void joinMember(MemberBean member) {
		System.out.println("멤버 서비스 조인에 진입");
		MemberDAOImpl.getInstance().insertMember(member);
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
	
//은지씨... 넘나 어려워여..... 
//은지씨 왜케 어렵져....  

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		/*for(int i=0;;) {
			if() {
				
			}
		}*/
		return member;
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
