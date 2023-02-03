package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class User {

public User() {
		// TODO Auto-generated constructor stub
	}
@Id	
	private int User_Id;
	private String User_Name;
	private String User_Email_Id;
	private String User_Password;

}