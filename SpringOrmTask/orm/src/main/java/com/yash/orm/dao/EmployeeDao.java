package com.yash.orm.dao;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.yash.orm.entities.Employee;

public class EmployeeDao implements Serializable {

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
		System.out.println("Employee By Id -> "+employee.toString());
		return employee;
	}
	
	public List<Employee> getAllEmployeeList(){
		List<Employee> employeeList = this.hibernateTemplate.loadAll(Employee.class);
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}
		return employeeList;
	}
	
	public void JoinTable() {
		//SELECT * FROM category c  inner join events e on e.category_i=c.category_id 
		//where c.parent_category_id=1; the why i need to join parent_category_id
		
	}
	
}
