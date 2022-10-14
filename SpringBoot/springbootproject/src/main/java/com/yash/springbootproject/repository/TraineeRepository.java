package com.yash.springbootproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.springbootproject.entities.Trainee;

@Repository
public interface TraineeRepository extends CrudRepository<Trainee, Integer>{
}
