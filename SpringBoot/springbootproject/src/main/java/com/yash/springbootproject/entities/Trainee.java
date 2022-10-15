package com.yash.springbootproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "trainee")
public class Trainee {
	
	@OneToOne
	@JoinColumn(name = "trainee_training_id")
	private Training training;
	
	@Id
	@Column(name = "trainee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int traineeId; 
	
	@Column(name = "trainee_name")
	private String traineeName;
	
	@Column(name = "trainee_exp")
	private double traineeExp;
	
	@Column(name = "trainee_status")
	private boolean traineeStatus;
	

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public double getTraineeExp() {
		return traineeExp;
	}

	public void setTraineeExp(double traineeExp) {
		this.traineeExp = traineeExp;
	}

	public boolean isTraineeStatus() {
		return traineeStatus;
	}

	public void setTraineeStatus(boolean traineeStatus) {
		this.traineeStatus = traineeStatus;
	}
	
	
}