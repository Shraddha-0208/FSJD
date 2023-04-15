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

import com.simplilearn.demo.entity.Booking;
import com.simplilearn.demo.service.BookingService;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/Booking")
public class BookingController {

	@Autowired
	private BookingService service;
	
	@PostMapping("/")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking u){
		
		Booking Booking= service.addBooking(u);
		
		if(Booking!=null)
			return new ResponseEntity<Booking>(Booking,HttpStatus.CREATED);
		else
			return new ResponseEntity<Booking>(Booking,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@GetMapping("/")
	public List<Booking> getAllBooking(){
		return service.getAllBooking();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Booking>getBookingById (@PathVariable int id){
		Booking Booking= service.getBookingById(id);
		
		if(Booking!=null)
			return new ResponseEntity<Booking>(Booking, HttpStatus.OK);
		else
			return new ResponseEntity<Booking>(Booking, HttpStatus.NOT_FOUND);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateBooking(@PathVariable int id,@RequestBody Booking newBooking){
		Booking Booking= service.updateBooking(id, newBooking);
		
		if (Booking!=null)
			return new ResponseEntity<Object>(Booking,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No Booking Available to Update",HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteBooking(@PathVariable int id){
		boolean result = service.deleteBooking(id);
		if(result) 
			return new ResponseEntity<String>("Object Deleted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("NO Booking Found", HttpStatus.NOT_FOUND);
		
	}
}
