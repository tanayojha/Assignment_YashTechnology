package com.yash.springbootproject.service;

import java.util.List;
import java.util.Optional;
import com.yash.springbootproject.entities.Project;

public interface ProjectService {
	
	//Create
	public Project createProject(Project project);
	
	//fetch List
	public List<Project> fetchProjectList();
	
	//Update
	Project updateProject(Project project, int id);
    
    //Delete
    String deleteProjectById(int id);
    
    //Get Project By ID
    Optional<Project> getProjectById(int id);
    
    //Delete All Trainee
    String deleteAllProject();

}
