package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.entity.Admin;
import com.simplilearn.demo.entity.User;
@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer> {

	Admin save(User u);

	
}
