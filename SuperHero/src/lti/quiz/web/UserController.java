package lti.quiz.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.RegisterBean;
import lti.quiz.service.UserService;
import lti.quiz.service.UserServiceImpl;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/user.quiz")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService service;

	
	
	@Override
	public void init() throws ServletException {
		service = new UserServiceImpl();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String referer = request.getHeader("referer");
		//Creates a fresh new session in the server if no 
		//session id found in request header
		//Otherwise old session identified by id in request header
		HttpSession session = request.getSession();
		
		if(request.getParameter("logout") != null) {
			//User request to logout
			session.invalidate(); //destroying session
			response.sendRedirect("index.jsp"); //send user to login page
			
		} else if(referer.contains("index")) {
			//Request is for login authentication
			LoginBean login = new LoginBean();
			
			login.setEmail(request.getParameter("email"));
			login.setPassword(request.getParameter("password"));
			RegisterBean user = service.authenticate(login);
			if(user!=null) {
				//Login successful
				//To remember the user throughout the session
				session.setAttribute("USER", user);
				response.sendRedirect("dashboard.jsp");
			} else {
				//Login unsuccessful
				response.sendRedirect("index.jsp?invalid=yes");
			}
			
		}else if(referer.contains("register")) {
			//Request is for new user registration
			RegisterBean register = new RegisterBean();
			register.setEmail(request.getParameter("email"));
			register.setPassword(request.getParameter("password"));
			register.setAnswer(request.getParameter("answer"));
			if(service.register(register)) {
				//Registration successful
				response.sendRedirect("index.jsp");
			} else {
				//Registration unsuccessful
				response.sendRedirect("register.jsp?exist=yes");
			}
			
		}else if(referer.contains("forget")) {
			//Request to validate user
			ForgetBean forget = new ForgetBean();
			forget.setEmail(request.getParameter("email"));
			forget.setAnswer(request.getParameter("answer"));
			if(service.validate(forget)) {
				//We have to remember users's email id in session
				session.setAttribute("EMAIL",  forget.getEmail());
				response.sendRedirect("change.jsp");
			} else {
				response.sendRedirect("forget.jsp");
			}
			
			
			
		}else {
			//Request to change password
			LoginBean change = new LoginBean();
			change.setEmail((String) session.getAttribute("EMAIL"));
			change.setPassword(request.getParameter("password"));
			if(service.update(change)) {
				//session.setAttribute("EMAIL", null);
				session.removeAttribute("EMAIL"); //password has been changed so we need not remember user
				response.sendRedirect("index.jsp");
			} else {
				response.sendRedirect("change.jsp");
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
