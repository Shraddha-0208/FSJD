package com.simplilearn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.Order;
import com.simplilearn.demo.repo.OrderRepo;

@Service
public class OrderService {
	@Autowired
	private OrderRepo repo;
	
	public Order addOrder(Order u) {
		return repo.save(u);
	}
	public List<Order> getAllOrder(){
		return repo.findAll();
	}
	public Order getOrderById(int id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public Order updateOrder(int id, Order newOrder) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deleteOrder(int id) {
		// TODO Auto-generated method stub
		return false;
	}
		
	
}
