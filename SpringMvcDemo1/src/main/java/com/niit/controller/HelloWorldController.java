package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController 
{

	@GetMapping("/")
public ModelAndView display()
{
	
	ModelAndView mv=new ModelAndView("welcome");
	
	return mv;
}

	

	@GetMapping("/about")
public ModelAndView showAbout()
{
	
	ModelAndView mv=new ModelAndView("about");
	
	return mv;
}

	

	@GetMapping("/reg")
public ModelAndView showRegister()
{
	
	ModelAndView mv=new ModelAndView("register");
	
	return mv;
}

}
