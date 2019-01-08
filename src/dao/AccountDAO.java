package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {
	
	public void insertAccount(AccountBean account);
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
