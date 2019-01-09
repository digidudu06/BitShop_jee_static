package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	//Controller와 연결해줌 
	private static MemberServiceImpl instance = new MemberServiceImpl();
	public MemberDAOImpl dao;
	
	private  MemberServiceImpl() {
		 dao = MemberDAOImpl.getInstance();	//코드가 길어지므로 짧게 하기 위해 //한번만 사용할 경우에는 성능에 차이가 없다.
	}
	public static MemberServiceImpl getInstance() {return instance;}
	
	@Override
	public void createMember(MemberBean member) {
		System.out.println("멤버 서비스 조인에 진입");
		dao.insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		return dao.selectAllMembers();
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		return dao.selectMembersByName(name);
	}
	
//은지씨... 넘나 어려워여..... 
//은지씨 왜케 어렵져....  
//은영언니 github에 박제

	@Override
	public MemberBean findMemberById(String id) {
		MemberBean member = new MemberBean();
		member = dao.selectMemberById(id);
		return member;
	}

	@Override
	public int countMembers() {
		
		return 0;
	}

	@Override
	public boolean login(String id, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMember(String id, String pass) {
		// TODO Auto-generated method stub
		
	}

}
