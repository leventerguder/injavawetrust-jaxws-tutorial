package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/page1")
public class Page1Controller {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	// http://localhost:8080/injavawetrust.springmvc/page1
	protected ModelAndView handleRequestInternal() {

		ModelAndView modelAndView = new ModelAndView("myPage1");
		modelAndView.addObject("message", "Hello Page1");
		return modelAndView;
	}
}
