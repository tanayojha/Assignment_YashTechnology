package com.yash.SpringJDBC.dao;

import java.util.List;
import com.yash.SpringJDBC.entities.Employee;

public interface EmployeeDao {
	
	public int insert(Employee employee);

	public int updatedetails(Employee employee);

	public int deletedetails(int stuid);

	public Employee selectDetails(int stuid);

	public List<Employee> getAllDetails();
	
}
