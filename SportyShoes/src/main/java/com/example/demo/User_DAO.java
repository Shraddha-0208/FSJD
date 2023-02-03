package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class User_DAO {
	//used for autogeneration of a reference for an object
		@Autowired
		User_Repo repo;
				
		public User insertuser(User u) {
			return repo.save(u);
		}
		
		public List<User> getall(){
			return repo.findAll();		}
		
		public String finduserbyname(String User_name, int User_Id)
		{
			return repo.findbyname(User_name, User_Id);
		}
		public User findbyuserpwd(String User_Name,String Password) {
		
			return repo.findbyuserpwd(User_Name, Password);
		}
		//public boolean checkEmail(String User_Email_Id) {
			
		//	return repo.existsByUser_Email_Id(User_Email_Id);
		//}
		public String findName(String User_Name) {
			
			return repo.findName(User_Name);
		}
		
}