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
		AccountService accountService = new AccountServiceImpl();
		if(dir==null) {
			dir = request.getServletPath().substring(1, request.getServletPath().indexOf('.'));
		}
		
		String page = request.getParameter("page");
		page = (page==null) ? "main" : page ;
		
		switch (cmd) {
		case "open-account": 
			String money = request.getParameter("money");
			AccountBean account = new AccountBean();
			String accountNum = accountService.openAccount(Integer.parseInt(money));
			account = accountService.findByAccount(accountNum);
			request.setAttribute("openAccount", account );
			Command.move(request, response, dir, page);
			break;
		case "move":
			System.out.println("액션이 이동");
			Command.move(request, response, dir, page);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
