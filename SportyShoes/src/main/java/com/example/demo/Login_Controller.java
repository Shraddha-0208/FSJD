package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Login_Controller {
	@Autowired
	User_DAO dao;
		
	
	@RequestMapping("/User_Login")
	public ModelAndView User_Login(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	String User_Name=request.getParameter("User_Name");
	String User_Password=request.getParameter("User_Password");
	User u=dao.findbyuserpwd(User_Name, User_Password);
	String UserName=dao.findName(User_Name);
		if(u!=null) {
			mv.setViewName("User_After_Login.jsp");
		}
		return mv;
	}
		@RequestMapping("/Admin_Login")
		public ModelAndView Admin_Login(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String Admin_Name=request.getParameter("user");
		String Admin_Password=request.getParameter("pwd");
			if(Admin_Name.equals(Admin_Password)) {
				mv.setViewName("Admin_After_Login.jsp");
			}
			return mv;
	}
}
	