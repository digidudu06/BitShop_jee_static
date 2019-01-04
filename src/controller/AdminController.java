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
 * Servlet implementation class AdminController
 */
@WebServlet("/admin.do")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" Admin 서블릿으로 들어옴 ");
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir=request.getServletPath().substring(1, request.getServletPath().indexOf('.'));
		}
		
		String page = request.getParameter("page");
		page = (page==null) ? "main" : page ;
		
		String cmd = request.getParameter("cmd");
		switch ((cmd == null) ? "move" : cmd) {
		case "move":
			System.out.println("액션이 이동");
			Command.move(request, response, dir, page);
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
