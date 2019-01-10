package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" Account 서블릿으로 들어옴 ");
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd ;
		
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir = request.getServletPath().substring(1, request.getServletPath().indexOf('.'));
		}
		
		String page = request.getParameter("page");
		page = (page==null) ? "main" : page ;
		
		String dest = request.getParameter("dest");
		dest = (dest==null) ? "NONE" : dest ;
		
		switch (cmd) {
		case "open-account": 
			System.out.println("cmd : "+cmd+" dir : "+dir+" page : "+page);
			
			String money = request.getParameter("money");
			AccountBean account = new AccountBean();
			account.setAccountNum(AccountServiceImpl.getInstance().createAccountNum());
			account.setMoney(Integer.parseInt(money));
			account.setToday(AccountServiceImpl.getInstance().today());
			AccountServiceImpl.getInstance().openAccount(account);
			
//			request.setAttribute("account", AccountServiceImpl.getInstance().findAccountById());
			request.setAttribute("dest", dest);
			Command.move(request, response, dir, page);
			break;
		case "move":
			System.out.println("액션이 이동");
			System.out.println("move &&&&& dest : "+dest);
			
			request.setAttribute("dest", dest);
			Command.move(request, response, dir, page);
			break;
		case "account-detail": break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
