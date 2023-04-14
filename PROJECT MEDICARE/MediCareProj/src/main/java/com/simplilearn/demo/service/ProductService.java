package com.simplilearn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.Product;
import com.simplilearn.demo.entity.User;
import com.simplilearn.demo.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo2;
	
	public Product addProduct(Product u) {
		return repo2.save(u);
	}
	public List<Product> getAllProduct(){
		return repo2.findAll();
	}
	public Product getUserById(int id) {
		if(repo2.findById(id).isPresent()) {
			return repo2.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public Product updateProduct(int id, Product newProduct) {
		if(repo2.findById(id).isPresent()) {
			Product oldproduct= repo2.findById(id).get();
			oldproduct.setName(newProduct.getName());
			oldproduct.setPrice(newProduct.getPrice());
			oldproduct.setDescription(newProduct.getDescription());
		
			return repo2.save(oldproduct);
		}
		else {
			return null;
		}
	}
	
	
	public boolean deleteProduct(int id) {
		if(repo2.findById(id).isPresent()) {
			repo2.deleteById(id);
			return true;
		}
		
		else {
			return false;
		}
	}
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
