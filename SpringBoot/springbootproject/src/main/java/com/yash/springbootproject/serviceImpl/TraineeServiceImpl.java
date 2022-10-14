package com.yash.springbootproject.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.springbootproject.entities.Trainee;
import com.yash.springbootproject.repository.TraineeRepository;
import com.yash.springbootproject.service.TraineeService;

@Service
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeRepository repository;

	@Override
	public Trainee insertTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return repository.save(trainee);
	}

	@Override
	public List<Trainee> fetchTraineeList() {
		// TODO Auto-generated method stub
		return (List<Trainee>) repository.findAll();
	}

	@Override
	public Trainee updateTrainee(Trainee trainee, int id) {
		// TODO Auto-generated method stub
		return repository.save(trainee);
	}

	@Override
	public String deleteTraineeById(int id) {
		// TODO Auto-generated method stub
		Optional<Trainee> tr;
		boolean flag = true;
		try {
			tr = getTraineeById(id);
			if (tr != null) {
				repository.deleteById(id);
				flag = false;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		if (flag == false) {
			return "Trainee with" + id + "removed";
		} else {
			return id + "Not Exist!";
		}
	}

	@Override
	public Optional<Trainee> getTraineeById(int id) {
		Optional<Trainee> t1 = Optional.ofNullable(new Trainee());
		t1 = repository.findById(id);
		// TODO Auto-generated method stub
		return t1;
	}

}