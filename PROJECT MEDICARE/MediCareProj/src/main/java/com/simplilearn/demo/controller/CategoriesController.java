package com.simplilearn.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.entity.Categories;
import com.simplilearn.demo.service.CategoriesService;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/Categories")
public class CategoriesController {

	@Autowired
	private CategoriesService service;
	
	@PostMapping("/")
	public ResponseEntity<Categories> addCategories(@RequestBody Categories u){
		
		Categories Categories= service.addCategories(u);
		
		if(Categories!=null)
			return new ResponseEntity<Categories>(Categories,HttpStatus.CREATED);
		else
			return new ResponseEntity<Categories>(Categories,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@GetMapping("/")
	public List<Categories> getAllCategories(){
		return service.getAllCategories();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categories>getCategoriesById (@PathVariable int id){
		Categories Categories= service.getCategoriesById(id);
		
		if(Categories!=null)
			return new ResponseEntity<Categories>(Categories, HttpStatus.OK);
		else
			return new ResponseEntity<Categories>(Categories, HttpStatus.NOT_FOUND);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateCategories(@PathVariable int id,@RequestBody Categories newCategories){
		Categories Categories= service.updateCategories(id, newCategories);
		
		if (Categories!=null)
			return new ResponseEntity<Object>(Categories,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No Categories Available to Update",HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteCategories(@PathVariable int id){
		boolean result = service.deleteCategories(id);
		if(result) 
			return new ResponseEntity<String>("Object Deleted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("NO Categories Found", HttpStatus.NOT_FOUND);
		
	}
}
