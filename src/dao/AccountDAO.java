package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {
	
	public void insertAccount(AccountBean account);
	
	public ArrayList<AccountBean> selectAllAccont();
	public AccountBean selectAccountByAccountNum(String accountNum);
	public int countAccountNum();
	
	public void deposit(String accountNum, int money);
	public void withdraw(String accountNum, int money);
	
	public void deleteAccount(String accountNum);
}
