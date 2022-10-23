package com.yash.otbs.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.otbs.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>  {

}
