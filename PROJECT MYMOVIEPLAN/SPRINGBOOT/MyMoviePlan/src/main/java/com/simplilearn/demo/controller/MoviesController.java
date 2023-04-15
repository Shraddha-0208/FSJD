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

import com.simplilearn.demo.entity.Movies;
import com.simplilearn.demo.service.MovieService;
@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/Movies")
public class MoviesController {

	@Autowired
	private MovieService service;
	
	@PostMapping("/")
	public ResponseEntity<Movies> addMovies(@RequestBody Movies u){
		
		Movies Movies= service.addMovies(u);
		
		if(Movies!=null)
			return new ResponseEntity<Movies>(Movies,HttpStatus.CREATED);
		else
			return new ResponseEntity<Movies>(Movies,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@GetMapping("/")
	public List<Movies> getAllMovies(){
		return service.getAllMovies();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Movies>getMoviesById (@PathVariable int id){
		Movies Movies= service.getMoviesById(id);
		
		if(Movies!=null)
			return new ResponseEntity<Movies>(Movies, HttpStatus.OK);
		else
			return new ResponseEntity<Movies>(Movies, HttpStatus.NOT_FOUND);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateMovies(@PathVariable int id,@RequestBody Movies newMovies){
		Movies Movies= service.updateMovies(id, newMovies);
		
		if (Movies!=null)
			return new ResponseEntity<Object>(Movies,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No Movies Available to Update",HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteMovies(@PathVariable int id){
		boolean result = service.deleteMovies(id);
		if(result) 
			return new ResponseEntity<String>("Object Deleted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("NO Movies Found", HttpStatus.NOT_FOUND);
		
	}
}
