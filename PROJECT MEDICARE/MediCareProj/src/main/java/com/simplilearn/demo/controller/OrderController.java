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

import com.simplilearn.demo.entity.Order;
import com.simplilearn.demo.service.OrderService;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/Order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/")
	public ResponseEntity<Order> addOrder(@RequestBody Order u){
		
		Order Order= service.addOrder(u);
		
		if(Order!=null)
			return new ResponseEntity<Order>(Order,HttpStatus.CREATED);
		else
			return new ResponseEntity<Order>(Order,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@GetMapping("/")
	public List<Order> getAllOrder(){
		return service.getAllOrder();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order>getOrderById (@PathVariable int id){
		Order Order= service.getOrderById(id);
		
		if(Order!=null)
			return new ResponseEntity<Order>(Order, HttpStatus.OK);
		else
			return new ResponseEntity<Order>(Order, HttpStatus.NOT_FOUND);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateOrder(@PathVariable int id,@RequestBody Order newOrder){
		Order Order= service.updateOrder(id, newOrder);
		
		if (Order!=null)
			return new ResponseEntity<Object>(Order,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No Order Available to Update",HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteOrder(@PathVariable int id){
		boolean result = service.deleteOrder(id);
		if(result) 
			return new ResponseEntity<String>("Object Deleted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("NO Order Found", HttpStatus.NOT_FOUND);
		
	}
}
