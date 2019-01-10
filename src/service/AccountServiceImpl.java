package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import com.sun.javafx.geom.transform.GeneralTransform3D;

import dao.AccountDAOImpl;
import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	private static AccountServiceImpl instance = new AccountServiceImpl();
	public AccountDAOImpl dao;
	private ArrayList<AccountBean> list;
	private AccountServiceImpl() {
		dao = AccountDAOImpl.getInstance();
		list = new ArrayList<>();
	}
	public static AccountServiceImpl getInstance() {return instance;}

	@Override
	public void openAccount(AccountBean account) {
		dao.insertAccount(account);
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
	public ArrayList<AccountBean> findAllAccont() {
		return dao.selectAllAccont();
	}

	@Override
	public AccountBean findAccountById(String id) {
		AccountBean account = new AccountBean();
		return account;
	}

	@Override
	public int countAccountNum() {
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
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
		
	}

	@Override
	public void withdraw(String accountNum, int money) {
		
	}

	@Override
	public void deleteAccount(String accountNum) {
		
	}

}