package com.practice.angularDemo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.angularDemo.Dao.EmployeeRepo;
import com.practice.angularDemo.entity.Employee;
import com.practice.angularDemo.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	//get all employees rest api
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}
	
	//Create employee rest api 
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}
	
	//get employee by id rest api
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id) {
		 Employee employee = repo.findById(id).orElseThrow( () -> new ResourceNotFoundException("Employee Data not Exist with id -> "+id));
		return ResponseEntity.ok(employee);
	}
	
	//update employee rest api
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employeeDetails){
		Employee employee = repo.findById(id).orElseThrow( () -> new ResourceNotFoundException("Employee Data not Exist with id -> "+id));
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
				
		Employee updatedEmployee = repo.save(employee);

		return ResponseEntity.ok(updatedEmployee);
	}
	
	//delete employee reset api
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id) {
		Employee employee = repo.findById(id).orElseThrow( ()-> new ResourceNotFoundException("Employee Data not Exist with id -> "+id));
		repo.delete(employee);
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	
	}

}
