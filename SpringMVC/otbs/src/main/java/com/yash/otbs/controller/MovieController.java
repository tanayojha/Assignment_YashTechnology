package com.yash.otbs.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yash.otbs.model.Movie;
import com.yash.otbs.service.MoviesService;

@Controller
public class MovieController {

	@Autowired
	MoviesService moviesService;

	@GetMapping("/addmovie")
	public String addMovie() {
		return "addmovies";
	}

	@PostMapping("/savemovie")
	public String saveMovie(@ModelAttribute("movie") Movie movie) {
		// save movie to database
		moviesService.saveMovie(movie);
		return "movielist";
	}

	@GetMapping("/movielist") 
	 public String showMoviesList(Model model) { 
	  //Using java 8
	  //create model attribute to bind form data
	  List<Movie> list_ = moviesService.getAllMovies();
	  List<Optional<Movie>> list = list_.stream().map(Optional::ofNullable).collect(Collectors.toList());

	  if (list.isEmpty()) { 
		  model.addAttribute("msg","no movies available");
	   } else { 
		  model.addAttribute("movie", list);
	   } 
	   return "movielist"; 
	  }

	@RequestMapping("/movielist/{movieid}")
	@ResponseBody
	public Optional<Movie> getMoviesListById(@PathVariable("movieid") int movieid) {
		return moviesService.getAllMoviesById(movieid);
	}

	/* It updates model object. */
	/*
	 * @RequestMapping(value="/editsave",method = RequestMethod.POST) public String
	 * editsave(@ModelAttribute("emp") Emp emp){ dao.update(emp); return
	 * "redirect:/viewemp"; }
	 */

	@GetMapping("/usermovielist")
	public String showUserMoviesList(Model model) {
		// create model attribute to bind form data
		List<Movie> list = moviesService.getAllMovies();

		if (list.isEmpty()) {
			model.addAttribute("movie", list);
		} else {
			model.addAttribute("msg", "no movies available");
		}

		return "usermovielist";
	}

}
