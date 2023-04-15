package com.simplilearn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.Booking;
import com.simplilearn.demo.repo.BookingRepo;

@Service
public class BookingService {
	@Autowired
	private BookingRepo repo;
	
	public Booking addbooking(Booking u) {
		return repo.save(u);
	}
	public List<Booking> getAllBooking(){
		return repo.findAll();
	}
	public Booking getBookingById(int id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public Booking updateBooking(int id, Booking newBooking) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deleteBooking(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	public Booking addBooking(Booking u) {
		// TODO Auto-generated method stub
		return null;
	}
		
	
}
