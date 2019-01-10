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

	@Override
	public MemberBean findMemberById(String id) {
		return dao.selectMemberById(id);
	}

	@Override
	public int countMembers() {
		
		return 0;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean ok = false;
		MemberBean member = dao.selectMemberById(id);
		if(member != null && id.equals(member.getId()) && pass.equals(member.getPass())){
			ok=true;
		}
		return ok;
	}

	@Override
	public void modifyMember(MemberBean member) {
		
	}

	@Override
	public void removeMember(String id, String pass) {
		
	}

}
