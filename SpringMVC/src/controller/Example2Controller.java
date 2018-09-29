package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Example2Controller { //it does not implements controller

	@RequestMapping("/example2.do")
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		ModelAndView mav = new ModelAndView("example1");//it is not example1.jsp bcoz of 
		mav.addObject("message", "Welcome to Spring MVC");
		return mav;
	}
}
