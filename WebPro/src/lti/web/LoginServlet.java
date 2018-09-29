package lti.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Reading request parameters
		String paramUser = request.getParameter("userid");
		String paramPass = request.getParameter("password");
		
		//Getting Init-params
		ServletConfig config= getServletConfig();
		String initUser=config.getInitParameter("User");
		String initPass=config.getInitParameter("Pass");
		
		if(paramUser.equals(initUser) && paramPass.equals(initPass)) {
			//Login successful
			response.sendRedirect("hello.jsp");
		} else {
			//Login failed
			response.sendRedirect("login.jsp?invalid=yes");
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
