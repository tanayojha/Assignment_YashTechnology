package com.yash.orm.dao;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.yash.orm.entities.Employee;

public class EmployeeDao {

	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insert(Employee employee) {
		int i = (Integer) this.hibernateTemplate.save(employee);
		return i;
	}
	
	@Transactional
	public void update(Employee employee) {
		this.hibernateTemplate.update(employee);
	}
	
	@Transactional
	public void delete(Employee employee) {
		this.hibernateTemplate.delete(employee);
	}
	
	
	public Employee getEmployeeById(int empId) {
		Employee employee = this.hibernateTemplate.get(Employee.class,empId);
		return employee;
	}
	
	public List<Employee> getAllEmployeeList(){
		List<Employee> employeeList = this.hibernateTemplate.loadAll(null);
		return employeeList;
	}
	
}
