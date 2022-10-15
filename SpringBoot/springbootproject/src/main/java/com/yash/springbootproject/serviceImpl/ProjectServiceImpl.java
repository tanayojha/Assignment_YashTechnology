package com.yash.springbootproject.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.springbootproject.entities.Project;
import com.yash.springbootproject.repository.ProjectRepository;
import com.yash.springbootproject.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository repository;

	@Override
	public Project createProject(Project project) {
		// TODO Auto-generated method stub
		return repository.save(project);
	}

	@Override
	public List<Project> fetchProjectList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Project updateProject(Project project, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProjectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Project> getProjectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAllProject() {
		// TODO Auto-generated method stub
		return null;
	}

}
