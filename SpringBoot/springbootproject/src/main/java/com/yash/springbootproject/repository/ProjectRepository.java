package com.yash.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.springbootproject.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
