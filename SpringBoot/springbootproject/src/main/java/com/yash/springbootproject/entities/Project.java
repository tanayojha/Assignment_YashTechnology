package com.yash.springbootproject.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "project")
public class Project {

	@Id
	@Column(name = "project_id")
	private int projectId;

	@Column(name = "project_name")
	private String projectName;

	@ManyToMany(mappedBy = "projectList")
	@JsonManagedReference
	private List<Trainee> traineeList;

	public List<Trainee> getTraineeList() {
		return traineeList;
	}

	public void setTraineeList(List<Trainee> traineeList) {
		this.traineeList = traineeList;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
