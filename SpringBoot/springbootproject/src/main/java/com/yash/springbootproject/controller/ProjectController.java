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
import com.yash.springbootproject.entities.Project;
import com.yash.springbootproject.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@PostMapping("/insertProject")
	public Project saveTrainee(@RequestBody Project project){
		return projectService.createProject(project);
	}
	
	@GetMapping("/fetchProject")
	public List<Project> fetchProjectList(){
		return projectService.fetchProjectList();
	}
	
	@PutMapping("/project/{projectId}")
    public Project updateProjectById(@RequestBody Project project, @PathVariable("projectId") int projectId ){
        return projectService.updateProject(project,projectId);
    }
	
	@DeleteMapping("/project/{projectId}")
	public String deleteProjectById(@PathVariable("projectId") int projectId){
		projectService.deleteProjectById(projectId);
		return "Project Deleted Done";
	}
	
	@GetMapping("/project/{projectId}")
	public Optional<Project> getProjectById(@PathVariable("projectId") int projectId ){
		return projectService.getProjectById(projectId);
	}
	
	@DeleteMapping("/project/deleteRecord")
	public String deleteAllRecord(){
		projectService.deleteAllProject();
		return "Project Record Deleted Done";
	}
	
}
