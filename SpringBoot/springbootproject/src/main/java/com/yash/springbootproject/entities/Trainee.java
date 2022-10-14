package com.yash.springbootproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "trainee")
public class Trainee {
	
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