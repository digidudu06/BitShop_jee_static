package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	public void createAdmin(AdminBean admin);
	
	public ArrayList<AdminService> findAllAdmins();
	public ArrayList<AdminService> findAdminsByAuth(String Auth);
	public AdminService findAdminByAdminNum(String adminNum);
	public int countAdmins();
	public boolean existAdmin(String adminNum, String pass);
	
	public void modifyAdmin(AdminBean admin);
	
	public void deleteAdmin(String adminNum, String pass);

}
