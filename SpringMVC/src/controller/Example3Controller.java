package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Example3Controller {

	@RequestMapping("/example3.do")
	public String doSomething(Map model) {                   //Spring mvc will inject Map model..Map model is dependency
		model.put("message", "Welcome to Spring MVC");		//it will return the changes by itself we need return
		return "example1";
	}
}
