package com.simplilearn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.Categories;
import com.simplilearn.demo.repo.CategoriesRepo;

@Service
public class CategoriesService {
	@Autowired
	private CategoriesRepo repo;
	
	public Categories addCategories(Categories u) {
		return repo.save(u);
	}
	public List<Categories> getAllCategories(){
		return repo.findAll();
	}
	public Categories getCategoriesById(int id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public Categories updateCategories(int id, Categories newCategories) {
		if(repo.findById(id).isPresent()) {
			Categories oldCategories= repo.findById(id).get();
			oldCategories.setName(newCategories.getName());
			oldCategories.setDescription(newCategories.getDescription());
			
			
			return repo.save(oldCategories);
		}
		else {
			return null;
		}
	}
	
	
	public boolean deleteCategories(int id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		
		else {
			return false;
		}
	}
}
