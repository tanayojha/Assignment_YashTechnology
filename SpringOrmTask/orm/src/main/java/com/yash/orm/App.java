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
        Employee emp = new Employee(1,"Tanay","tanay.ojha@yash.com");
        //Insert data of employee into database;
        empDao.insert(emp);
        //Update data of employee into database
        empDao.update(emp);
    }
}
