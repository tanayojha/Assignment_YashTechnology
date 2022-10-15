package com.yash.springbootproject.service;

import java.util.List;
import java.util.Optional;

import com.yash.springbootproject.entities.Trainee;

public interface TraineeService {
	
	//Create or Insert
	public Trainee insertTrainee(Trainee trainee);
	
	//Read
    List<Trainee> fetchTraineeList();
    
    //Update
    Trainee updateTrainee(Trainee trainee, int id);
    
    //Delete
    String deleteTraineeById(int id);
    
    //GetTraineeByID
    Optional<Trainee> getTraineeById(int id);
    
    //Delete All Trainee
    String deleteAllTrainee();
      
    

}
