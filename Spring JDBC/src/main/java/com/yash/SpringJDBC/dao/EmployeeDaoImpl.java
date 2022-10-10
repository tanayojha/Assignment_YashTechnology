package com.yash.springjdbc.dao;

import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import com.yash.springjdbc.entities.Employee;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcte;


	public JdbcTemplate getJdbcte() {
		return jdbcte;
	}

	public void setJdbcte(JdbcTemplate jdbcte) {
		this.jdbcte = jdbcte;
	}

	public int insertEmployee(Employee employee) {
		// TODO Auto-generated method stub	
		//Now here we are going to insert data into our database by writing insert query
		//String query = "insert into employee(id,name,email) values(?,?,?)";
		String query = "insert into employee(id,name,email) values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getEmail()+"')";
		int insert = this.jdbcte.update(query);
		
		return insert;
	}

	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		//Now here we are going to update data into our database by writing update query
		String query = "update employee set name='"+employee.getName()+"',email='"+employee.getEmail()+"' where id='"+employee.getId()+"'";
		int update = this.jdbcte.update(query);

		return update;
	}
	
	public int updateEmployeeName(Employee employee) {
		// TODO Auto-generated method stub
		String query = "update employee set name='"+employee.getName()+"' where id='"+employee.getId()+"'";
		int update = this.jdbcte.update(query);
		return update;
	}
	
	
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		String query = "delete from employee where id='"+empId+"'";
		int delete = this.jdbcte.update(query);
		return delete;
	}

	
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		String query = "select * from employee where id='"+empId+"'";
		RowMapper<Employee> mapper = new RowMapperImpl();
		Employee object = this.jdbcte.queryForObject(query, mapper);
		
		return object;
	}

	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		String query = "select * from employee";
		List<Employee> employeeList = this.jdbcte.query(query, new RowMapperImpl());
		return employeeList;
	}

}
