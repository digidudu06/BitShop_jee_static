package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	public void openAccount(AccountBean account);
	public String createAccountNum();
	
	public ArrayList<AccountBean> findAllAccont();
	public AccountBean findAccountById(String Id);
	public int countAccountNum();
	public boolean existAccountNum(String accountNum);
	public String today();
	
	public void deposit(String accountNum, int money);
	public void withdraw(String accountNum, int money);
	
	public void deleteAccount(String accountNum);

}
