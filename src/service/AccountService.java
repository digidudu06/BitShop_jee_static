package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	public void create();
	public ArrayList<AccountBean> findAll();
	public AccountBean findByAccount();
	public int countAccountNum();
	public boolean existAccountNum();
	public void deposit();
	public void withdraw();
	public void deleteAccount();

}
