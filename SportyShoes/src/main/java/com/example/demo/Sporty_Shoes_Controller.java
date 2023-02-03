package com.example.demo;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Sporty_Shoes_Controller {
	@Autowired
	Sporty_Shoes_DAO dao;
		
	
	@RequestMapping("/Add_Shoes")
	public ModelAndView Shoeinsert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Sporty_Shoes ss=new Sporty_Shoes();
		ss.setShoe_Id(Integer.parseInt(request.getParameter("Shoe_Id")));
		ss.setShoe_Brand(request.getParameter("Shoe_Brand"));
		ss.setShoe_Price(request.getParameter("Shoe_Price"));
		Sporty_Shoes s3=dao.Shoeinsert(ss);
		if(s3!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
	}

	@RequestMapping("/getall")
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Sporty_Shoes> list=dao.getall();
	mv.setViewName("Admin_Shoe_display.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	
	@RequestMapping("/User_Shoe_display")
	public ModelAndView User_Shoe_display(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Sporty_Shoes> User_Shoe_display=dao.getall();
	mv.setViewName("User_Shoe_display.jsp");
	mv.addObject("list",User_Shoe_display);	
		return mv;
	}
	

	@RequestMapping("/Delete_Shoes")
	public ModelAndView DeleteShoe(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Sporty_Shoes ss=new Sporty_Shoes();
		ss.setShoe_Id(Integer.parseInt(request.getParameter("Shoe_Id")));
		String s1=dao.DeleteShoe(ss);
		if(s1!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
	}
	@RequestMapping("/Edit_Shoes")
	public ModelAndView EditShoe(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Sporty_Shoes ss=new Sporty_Shoes();
		ss.setShoe_Id(Integer.parseInt(request.getParameter("Shoe_Id")));
		ss.setShoe_Brand(request.getParameter("Shoe_Brand"));
		ss.setShoe_Price(request.getParameter("Shoe_Price"));
		Sporty_Shoes s2=dao.edit(ss);
		if(s2!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
	
	}
}

