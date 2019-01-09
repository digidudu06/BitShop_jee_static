package dao;

import java.util.ArrayList;

import domain.AdminBean;
import service.AdminService;

public interface AdminDAO {
	public void insertAdmin(AdminBean admin);
	
	public ArrayList<AdminBean> selectAllAdmins();
	public ArrayList<AdminBean> selectAdminsByAuth(String Auth);
	public AdminBean selectAdminByAdminNum(String adminNum);
	public int countAdmins();
	
	public void updateAdmin(AdminBean admin);
	
	public void deleteAdmin(String adminNum, String pass);
}
