package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@RequestMapping("/")
	public String getFirstPage() {
		return "abc.html";
	}
	
	
	@RequestMapping("/signin")
	public String getSignIn() {
		return "login.html";
	}
	
	@RequestMapping("/verify")
	public String verifyUser(String username, String passwd, HttpSession session) {
		if (username.equals(passwd)){
			session.setAttribute("username", username);
			return "welcome.jsp";
		}
		return "login.html";
	}
	
	@RequestMapping("/verifymv")
	public ModelAndView verifyUserMv(String username, String passwd) {
		ModelAndView mv = new ModelAndView();
		if (username.equals(passwd)){
			mv.addObject("username", username);
			mv.setViewName("welcome.jsp");
		}else {
			mv.setViewName("login.html");
		}
		return mv;
	}
}
