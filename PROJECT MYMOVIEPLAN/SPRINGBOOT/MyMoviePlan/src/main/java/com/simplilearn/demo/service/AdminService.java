package com.simplilearn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.Admin;
import com.simplilearn.demo.entity.User;
import com.simplilearn.demo.repo.AdminRepo;

@Service
public class AdminService {
	@Autowired
	private AdminRepo repo1;
	
	public Admin addUser(User u) {
		return repo1.save(u);
	}
	public List<Admin> getAllUser(){
		return repo1.findAll();
	}
	public Admin getUserById(int id) {
		if(repo1.findById(id).isPresent()) {
			return repo1.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public Admin updateUser(int id, User newUser) {
		if(repo1.findById(id).isPresent()) {
			Admin olduser= repo1.findById(id).get();
			olduser.setUsername(newUser.getName());
			olduser.setPassword(newUser.getPassword());
						
			return repo1.save(olduser);
		}
		else {
			return null;
		}
	}
	
	
	public boolean deleteUser(int id) {
		if(repo1.findById(id).isPresent()) {
			repo1.deleteById(id);
			return true;
		}
		
		else {
			return false;
		}
	}
}
