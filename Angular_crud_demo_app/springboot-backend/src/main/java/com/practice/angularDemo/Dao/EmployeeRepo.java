package com.practice.angularDemo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.angularDemo.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
