package service;

import java.util.ArrayList;

public interface AdminService {
	public void create();
	public ArrayList<AdminService> findAll();
	public ArrayList<AdminService> findSome();
	public AdminService findOne();
	public int count();
	public boolean exist();
	public void update();
	public void delete();

}
