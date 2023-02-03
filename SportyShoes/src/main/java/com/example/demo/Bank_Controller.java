package com.example.demo;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Bank_Controller {
	@Autowired
	Bank_DAO dao;
		
	
	@RequestMapping("/InsertBank")
	public ModelAndView bankinsert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Bank b=new Bank();
		b.setBank_Id(Integer.parseInt(request.getParameter("Bank_Id")));
		b.setBank_Name(request.getParameter("Bank_Name"));
		b.setBank_Balance(Float.parseFloat(request.getParameter("Bank_Balance")));
		Bank bb=dao.Bankinsert(b);
		if(bb!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
	}
	
	
}

