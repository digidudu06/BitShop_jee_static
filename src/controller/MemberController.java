package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" 멤버 서블릿으로 들어옴 ");
		String action = request.getParameter("action");
		action = (action==null) ? "move" : action;
		switch(action) {
		case "login": 
			System.out.println("액션이 로그인");
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			System.out.println("ID : " + id + " PASS : "+ pass);
			if(id.equals("d") && pass.equals("dd")) {
				Command.move(request, response, "home/main");
			}else {
				Command.move(request, response, "index");
			}
			break;
		case "move" : 
			System.out.println("액션이 이동");
			Command.move(request, response, "member/main");
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
