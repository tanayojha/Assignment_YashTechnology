package com.yash.springbootproject.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.springbootproject.entities.Training;
import com.yash.springbootproject.repository.TrainingRepository;
import com.yash.springbootproject.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {
	
	@Autowired
	TrainingRepository repository;

	@Override
	public Training createTraining(Training training) {
		// TODO Auto-generated method stub
		return repository.save(training);
	}

	@Override
	public List<Training> trainingList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
