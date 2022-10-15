package com.yash.springbootproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yash.springbootproject.entities.Trainee;
import com.yash.springbootproject.service.TraineeService;

@RestController
public class TraineeController {

	@Autowired
	TraineeService traineeService;
	
	@PostMapping("/insertTrainee")
	public Trainee saveTrainee(@RequestBody Trainee trainee){
		return traineeService.insertTrainee(trainee);
	}
	
	@GetMapping("/fetchTrainee")
	public List<Trainee> fetchTraineeList(){
		return traineeService.fetchTraineeList();
	}
	
	@PutMapping("/trainee/{traineeId}")
    public Trainee updateTraineeById(@RequestBody Trainee trainee, @PathVariable("traineeId") int traineeId ){
        return traineeService.updateTrainee(trainee,traineeId);
    }
	
	@DeleteMapping("/trainee/{traineeId}")
	public String deleteTraineeById(@PathVariable("traineeId") int traineeId){
		traineeService.deleteTraineeById(traineeId);
		return "Trainee Deleted Done";
	}
	
	@GetMapping("/trainee/{traineeId}")
	public Optional<Trainee> getTrainingById(@PathVariable("traineeId") int traineeId ){
		return traineeService.getTraineeById(traineeId);
	}
	
	@DeleteMapping("/trainee/deleteRecord")
	public String deleteAllRecord(){
		traineeService.deleteAllTrainee();
		return "Trainee Record Deleted Done";
	}
	
	
	
	
}
