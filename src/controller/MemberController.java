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
		
		String page = request.getParameter("page");
		if(page==null) {page = "main";}
		System.out.println("page : " + page);
		
		String dir = request.getParameter("dir");
		if(dir==null) {
			String servletPath = request.getServletPath();
			System.out.println(servletPath);
			String arr = servletPath.substring(1,servletPath.indexOf('.'));
			System.out.println("arr : "+arr);
			dir=arr;
		}
		System.out.println("dir  :::"+dir);

		String cmd = request.getParameter("cmd");
		System.out.println("cmd : "+cmd);
		switch((cmd==null) ? "move" : cmd) {
		case "login": 
			System.out.println("액션이 로그인");
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			System.out.println("ID : " + id + " PASS : "+ pass);
			if(!(id.equals("d") && pass.equals("dd"))) {
				dir = "";
				page = "index";
				System.out.println("dir "+dir+" page "+page);
			}
			request.setAttribute("name", "Park");
			request.setAttribute("compo", "login-success");
			Command.move(request, response, dir, page);
			break;
		case "move" : 
			System.out.println("액션이 이동");
			String dest = request.getParameter("dset");
			dest = (dest==null) ? "NONE" : dest ;
			request.setAttribute("dest",dest);
			Command.move(request, response, dir, page);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
