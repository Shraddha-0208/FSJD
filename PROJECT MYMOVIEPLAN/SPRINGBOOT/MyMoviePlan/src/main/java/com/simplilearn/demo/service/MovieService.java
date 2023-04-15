package com.simplilearn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.Movies;
import com.simplilearn.demo.entity.User;
import com.simplilearn.demo.repo.MovieRepo;

@Service
public class MovieService {
	@Autowired
	private MovieRepo repo2;
	
	public Movies addMovie(Movies u) {
		return repo2.save(u);
	}
	public List<Movies> getAllMovie(){
		return repo2.findAll();
	}
	public Movies getUserById(int id) {
		if(repo2.findById(id).isPresent()) {
			return repo2.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public Movies updateMovie(int id, Movies newMovie) {
		if(repo2.findById(id).isPresent()) {
			Movies oldMovie= repo2.findById(id).get();
			oldMovie.setMoviename(newMovie.getMoviename());
			oldMovie.setPrice(newMovie.getPrice());
			oldMovie.setDescription(newMovie.getDescription());
		
			return repo2.save(oldMovie);
		}
		else {
			return null;
		}
	}
	
	
	public boolean deleteMovie(int id) {
		if(repo2.findById(id).isPresent()) {
			repo2.deleteById(id);
			return true;
		}
		
		else {
			return false;
		}
	}
	public Movies getMovieById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}
	public Movies getMoviesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public Movies updateMovies(int id, Movies newMovies) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean deleteMovies(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	public Movies addMovies(Movies u) {
		// TODO Auto-generated method stub
		return null;
	}
}
