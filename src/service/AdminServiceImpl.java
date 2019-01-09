package service;

import java.util.ArrayList;

import dao.AdminDAOImpl;
import domain.AdminBean;

public class AdminServiceImpl implements AdminService {
	private static AdminServiceImpl instance = new AdminServiceImpl();
	public AdminDAOImpl dao;
	private AdminServiceImpl() {
		dao = AdminDAOImpl.getInstance();
	}
	public static AdminServiceImpl getInstance() {return instance;}

	@Override
	public void createAdmin(AdminBean admin) {
		dao.insertAdmin(admin);
	}

	@Override
	public ArrayList<AdminService> findAllAdmins() {
		return null;
	}

	@Override
	public ArrayList<AdminService> findAdminsByAuth(String Auth) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminService findAdminByAdminNum(String adminNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAdmins() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAdmin(String adminNum, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyAdmin(AdminBean admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(String adminNum, String pass) {
		// TODO Auto-generated method stub
		
	}

}
