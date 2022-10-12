package com.yash.orm;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.orm.dao.EmployeeDao;
import com.yash.orm.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/orm/config.xml");
        EmployeeDao empDao  =context.getBean("employeeDao",EmployeeDao.class);
        Employee emp = new Employee();
        emp.setEmpId(1);
        //emp.setEmpName("Tanay");
        //emp.setEmail("tanay.ojha@yash.com");
        //emp = new Employee("3","deepesh","deepesh@yash.com");
        //Insert data of employee into database;
        //empDao.insert(emp);
        //emp.setEmpId(3);
        //emp.setEmpName("deepesh");
        //emp.setEmail("deepesh@yash.com");
        //empDao.insert(emp);
        //Update data of employee into database
        //empDao.update(emp);
        //Delete data from database
        //empDao.delete(emp);
        //Get all employees detail from database
        empDao.getAllEmployeeList();
        //Get employee detail from empId by database
        empDao.getEmployeeById(emp.getEmpId());
        
    }
}
