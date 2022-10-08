package com.wipro.eb.main;

import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.service.ConnectionService;

public class EBMain {
	public static void main(String a[]) throws InvalidReadingException, InvalidConnectionException
	{
	System.out.println(new ConnectionService().generateBill(320,200,"Commercial"));
	//test case1
	System.out.println(new ConnectionService().generateBill(100,70,"Domestic"));
	//test case2
	System.out.println(new ConnectionService().generateBill(155,80,"Domestic"));
	//test case3
	System.out.println(new ConnectionService().generateBill(450,200,"Domestic"));
	//test case4
	System.out.println(new ConnectionService().generateBill(240,200,"Commercial"));
	}
	
	

}


