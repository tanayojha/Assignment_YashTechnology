package com.yash.springbootproject.serviceImpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Training updateTraining(Training training, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTrainingById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Training> getTrainingById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAllTraining() {
		// TODO Auto-generated method stub
		return null;
	}

}
