package com.yash.springbootproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yash.springbootproject.entities.Training;
import com.yash.springbootproject.service.TrainingService;

@RestController
public class TrainingController {
	
	@Autowired
	TrainingService service;
	
	@PostMapping("/createTraining")
	public Training createTraining(@RequestBody Training training) {
		return service.createTraining(training);
	}
	
	@GetMapping("/fetchTrainingList")
	public List<Training> fetchTrainingList(){
		return service.trainingList();
	}
	
	
}
