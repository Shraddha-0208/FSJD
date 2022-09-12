package org.simplilearn.myprojects;

import java.util.*;
	
	public class ValidationOfEmailIdFinal {
		public static void main(String args[]) {
			ArrayList<String> emails= new ArrayList<String>();
				
			emails.add("snehasanhotra1@gmail.com");
			emails.add("snehasanhotra2@gmail.com");
			emails.add("snehasanhotra3@gmail.com");
			emails.add("snehasanhotra4@gmail.com");
			emails.add("snehasanhotra5@gmail.com");
			emails.add("snehasanhotra6@gmail.com");
			emails.add("snehasanhotra7@gmail.com");
			emails.add("snehasanhotra8@gmail.com");
			emails.add("snehasanhotra9@gmail.com");
			emails.add("snehasanhotra10@gmail.com");
			
			Scanner sc =new Scanner(System.in);
	        
	        System.out.println("Enter your email ID  for validation :");
	        
	        String email = sc.next();
	      	      
	        if (emails.contains(email))
				System.out.println("User entered email id is valid");
			else
				System.out.println("User entered email id is not valid, kindly enter valid email id");
	        
		} 
	       }
	           
		




