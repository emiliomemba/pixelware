package com.pixelware.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
	@RequestMapping (value="/",method=RequestMethod.GET)
	public String index() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		System.out.println(modelAndView.getStatus());
		
		return "index";		
	}




}
