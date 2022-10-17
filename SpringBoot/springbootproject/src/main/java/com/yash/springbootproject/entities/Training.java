package com.yash.springbootproject.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "training")
public class Training {

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int trainingId;

	@Column(name = "training_name")
	private String trainingName;

	@Column(name = "training_days", nullable = true)
	private int trainingDays;

	@Column(name = "training_mentor", nullable = false)
	private String trainingMentor;

	@Column(name = "training_venue")
	private String trainingVenue;

	@Column(name = "training_strength")
	private int trainingStrength;
	
	@OneToMany(mappedBy = "training")
	//@JsonManagedReference
	private List<Trainee> traineeList;


	public List<Trainee> getTraineeList() {
		return traineeList;
	}

	public void setTraineeList(List<Trainee> traineeList) {
		this.traineeList = traineeList;
	}

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public int getTrainingDays() {
		return trainingDays;
	}

	public void setTrainingDays(int trainingDays) {
		this.trainingDays = trainingDays;
	}

	public String getTrainingMentor() {
		return trainingMentor;
	}

	public void setTrainingMentor(String trainingMentor) {
		this.trainingMentor = trainingMentor;
	}

	public String getTrainingVenue() {
		return trainingVenue;
	}

	public void setTrainingVenue(String trainingVenue) {
		this.trainingVenue = trainingVenue;
	}

	public int getTrainingStrength() {
		return trainingStrength;
	}

	public void setTrainingStrength(int trainingStrength) {
		this.trainingStrength = trainingStrength;
	}

}
