package com.example.demo;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class User_Controller {
	@Autowired
	User_DAO dao;
		
	
	@RequestMapping("/InsertUser")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User u=new User();
		u.setUser_Id(Integer.parseInt(request.getParameter("User_Id")));
		u.setUser_Name(request.getParameter("User_Name"));
		u.setUser_Email_Id(request.getParameter("User_Email_Id"));
		u.setUser_Password(request.getParameter("User_Password"));
		User u1=dao.insertuser(u);
		if(u1!=null) {
			mv.setViewName("successuser.jsp");
		}
		return mv;
	}

	@RequestMapping("/UserList")
	public ModelAndView UserList(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<User> UserList=dao.getall();
	mv.setViewName("User_display.jsp");
	mv.addObject("list",UserList);	
		return mv;
	}
}

