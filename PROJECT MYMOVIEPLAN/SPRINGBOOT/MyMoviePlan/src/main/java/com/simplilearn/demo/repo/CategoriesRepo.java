package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.entity.Categories;
import com.simplilearn.demo.entity.User;

@Repository
public interface CategoriesRepo extends JpaRepository<Categories,Integer> {

	Categories save(Categories u);


}
