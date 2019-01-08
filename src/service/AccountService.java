package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	public void openAccount(AccountBean account);
	public String createAccountNum();
	
	public ArrayList<AccountBean> findAll();
	public AccountBean findByAccount(String accountNum);
	public int countAccountNum();
	public boolean existAccountNum(String accountNum);
	public String today();
	
	public void deposit(String account, int money);
	public void withdraw(String account, int money);
	
	public void deleteAccount(String accountNum);

}
