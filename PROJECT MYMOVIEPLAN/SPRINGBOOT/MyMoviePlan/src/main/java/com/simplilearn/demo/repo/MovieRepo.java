package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.entity.Movies;
import com.simplilearn.demo.entity.User;

@Repository
public interface MovieRepo extends JpaRepository<Movies,Integer> {

	


}
