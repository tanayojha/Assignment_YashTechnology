package com.yash.otbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.otbs.dao.MovieRepository;
import com.yash.otbs.model.Movie;

@Service
public class MoviesService {
	
	@Autowired
	MovieRepository movieRepository;
		
	public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
	
	public Optional<Movie> getAllMoviesById(int movieid) {
        return movieRepository.findById(movieid);
    }

	public void saveMovie(Movie movie) {
		// TODO Auto-generated method stub
        this.movieRepository.save(movie);
	}
	

}
