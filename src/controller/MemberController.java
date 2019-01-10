package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberBean member = null;
		System.out.println(" 멤버 서블릿으로 들어옴 ");
		
		String page = request.getParameter("page");
		if(page==null) {page = "main";}
		System.out.println("page : " + page);
		
		String dir = request.getParameter("dir");
		if(dir==null) {
			String servletPath = request.getServletPath();
			String arr = servletPath.substring(1,servletPath.indexOf('.'));
			dir=arr;
		}
		System.out.println("dir  :::"+dir);
		
		String dest = request.getParameter("dest");
		dest = (dest==null) ? "NONE" : dest ;
		
		String cmd = request.getParameter("cmd");
		System.out.println("cmd : "+cmd);
		switch((cmd==null) ? "move" : cmd) {
		case "login": 
			System.out.println("액션이 로그인");
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			System.out.println("ID : " + id + " PASS : "+ pass);
			if(!(MemberServiceImpl.getInstance().existMember(id, pass))) {
				System.out.println("로그인 실패");
				dir = "";
				page = "index";
				System.out.println("dir "+dir+" page "+page);
			}else {
				System.out.println("로그인 성공");
				member = MemberServiceImpl.getInstance().findMemberById(id);
				request.setAttribute("member", member);
				request.setAttribute("dest", dest);
			}
			break;
		case "move": 
			System.out.println("액션이 이동");
			request.setAttribute("dest",dest);
			break;
		case "join": 
			System.out.println("액션이 조인");
			member = new MemberBean();
			member.setName(request.getParameter("name"));
			member.setId(request.getParameter("id"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().createMember(member);
			
			member = MemberServiceImpl.getInstance().findMemberById(member.getId());
			request.setAttribute("member", member);
			request.setAttribute("dest",dest);
			break;
		case "logout":
			dir = "";
			page = "index";
			dest= "";
			break;
		}
		Command.move(request, response, dir, page);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
