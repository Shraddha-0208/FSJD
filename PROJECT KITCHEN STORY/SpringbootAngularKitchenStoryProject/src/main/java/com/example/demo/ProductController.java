package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class ProductController {

	@Autowired
	ProductRepo repo;
	
	//insert
	@PostMapping("/Add")
	public String Add(@RequestBody Product product) {
		repo.save(product);
		return "The item  "+product.getName()+" is added successfully!!";
	}
	
	//list of products
	@GetMapping("/getAllproducts")
	public List<Product> findAllproducts(){
		return (List<Product>) repo.findAll();
	}
	
	//search with name
	@GetMapping("/findname/{name}")
	public List<Product> findProduct(@PathVariable String name){
		return repo.findByname(name);
	}
	
	//delete the record
	@DeleteMapping("/delete/{id}")
	public List<Product> deleteitem(@PathVariable int id){
		repo.deleteById(id);
		return repo.findAll();
	}
	
}


