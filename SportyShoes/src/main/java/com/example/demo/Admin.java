package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Admin {

@Id	
	private int Admin_Id;
	private String Admin_Name;
	private String Admin_Email_Id;
	private String Admin_Password;

}