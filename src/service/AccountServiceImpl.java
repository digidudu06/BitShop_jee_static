package service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public String openAccount(int money) {
		String createAccountNum = "";
		Random random = new Random();
		createAccountNum = random.nextInt(9000)+1000+"-";
		for(int i=0; i<4; i++) {
			createAccountNum += random.nextInt(10);
		}
		
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum);
		account.setMoney(money);
		account.setToday(today());
		list.add(account);
		return createAccountNum;
	}

	@Override
	public String createAccountNum() {
		String createAccountNum = "";
		Random random = new Random();
		createAccountNum = random.nextInt(9000)+1000+"-";
		for(int i=0; i<4; i++) {
			createAccountNum += random.nextInt(10);
		}
		return createAccountNum;
	}

	@Override
	public ArrayList<AccountBean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccount(String accountNum) {
		AccountBean account = new AccountBean();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
			}
		}
		return account;
	}

	@Override
	public int countAccountNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String today() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
 		return sdf.format(date);
	}

	@Override
	public void deposit(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}