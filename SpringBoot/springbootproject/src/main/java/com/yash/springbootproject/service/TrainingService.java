package com.yash.springbootproject.service;

import java.util.List;
import java.util.Optional;

import com.yash.springbootproject.entities.Training;

public interface TrainingService {
	
	//Create Training
	public Training createTraining(Training training);

	// fetch List
	public List<Training> trainingList();

	// Update
	Training updateTraining(Training training, int id);

	// Delete
	String deleteTrainingById(int id);

	// GetTraineeByID
	Optional<Training> getTrainingById(int id);

	// Delete All Trainee
	String deleteAllTraining();
    
}
