package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface User_Repo extends JpaRepository<User,Integer> {


	@Query("select u from User u where u.User_Name=?1 and User_Password=?2")
	public User findbyuserpwd(String User_Name,String Password);
	

	@Query("select u.User_Name from User u where u.User_Name=?1 and User_Id=?2")
	public String findbyname(String User_Name,int User_Id);


	//public boolean existsByUser_Email_Id(String User_Email_Id);
	
	
	@Query("select u from User u where u.User_Name LIKE %?1%"+ "OR u.User_Email_Id LIKE %?1%")
	public List<User> findAll(String Keyword);
	
	@Query("select u.User_Name from User u where u.User_Name=?1")
	public String findName(String User_Name);
}


