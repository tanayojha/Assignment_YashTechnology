package com.yash.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.yash.springjdbc.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Employee employee) {
		// TODO Auto-generated method stub	
		
		String query = "insert into employee(id,name,email) values(?,?,?)";
		int update = this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getEmail());
		
		return update;
	}

	public int updatedetails(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deletedetails(int stuid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Employee selectDetails(int stuid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
