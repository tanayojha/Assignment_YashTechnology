package com.yash.springjdbc.dao;

import java.util.List;
import com.yash.springjdbc.entities.Employee;

public interface EmployeeDao {

	public int insertEmployee(Employee employee);

	public int updateEmployee(Employee employee);

	public int updateEmployeeName(Employee employee);

	public int deleteEmployee(int empId);

	public Employee getEmployeeById(int empId);

	public List<Employee> getAllEmployeeDetails();

}
