package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.entity.Order;
@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {


}
