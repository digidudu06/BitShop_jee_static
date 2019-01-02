package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pool.Constant;

public class Command {
	public static void move(HttpServletRequest request, HttpServletResponse response, String path) throws ServletException, IOException {
		request.getRequestDispatcher((path.equals("index")) ? "/index" + Constant.JSP : Constant.VIEW + path + Constant.JSP).forward(request, response);
	}

}
