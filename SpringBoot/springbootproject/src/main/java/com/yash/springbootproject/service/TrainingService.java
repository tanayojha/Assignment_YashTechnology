package com.yash.springbootproject.service;

import java.util.List;

import com.yash.springbootproject.entities.Training;

public interface TrainingService {
	
	public Training createTraining(Training training);
	public List<Training>trainingList();

}
