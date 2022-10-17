package com.yash.springbootproject.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "trainee")
public class Trainee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int traineeId;

	@Column(name = "trainee_name")
	private String traineeName;

	@Column(name = "trainee_exp")
	private double traineeExp;

	@Column(name = "trainee_status")
	private boolean traineeStatus;

	@ManyToOne()
	@JoinColumn(name = "trainee_training_id")
	//@JsonBackReference
	private Training training;

	@ManyToMany(targetEntity = Project.class, cascade = {CascadeType.ALL})
	private List<Project> projectList;

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

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