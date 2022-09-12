package org.simplilearn.myprojects;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.List;
    import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


	public class ValidationOfEmailId {
		public static void main(String[] args) {
			
			List<String> list= new ArrayList<>();
			
			String array[]={"snehasanhotra1@gmail.com","snehasanhotra2@gmail.com","snehasanhotra3@gmail.com","snehasanhotra4@gmail.com","snehasanhotra5@gmail.com","snehasanhotra6@gmail.com","snehasanhotra7@gmail.com","snehasanhotra8@gmail.com","snehasanhotra9@gmail.com","snehasanhotra10@gmail.com"};
			
			Collections.addAll(list, array);
				
	        Scanner sc =new Scanner(System.in);
	        
	        System.out.println("Enter your email ID  for validation :");
	        
	        String email = sc.next();
	      
	       for(int i=0;i<array.length;i++) 
	        
	        
	        {
	            if(email.equals(array[i])) {
	                
	               System.out.println("User entered email id is valid"  );
	             break;
	            }
	            
	            
	          else
	        
	               System.out.println("User entered email id is not valid" );	
	          
	            
	      	
	    
	       
	        }} }
	           
		




