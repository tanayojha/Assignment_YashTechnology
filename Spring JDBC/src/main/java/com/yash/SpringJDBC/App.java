package com.yash.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.springjdbc.dao.EmployeeDao;
import com.yash.springjdbc.entities.Employee;


public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/springjdbc/applicationcontext.xml");
        EmployeeDao employeeDao = context.getBean("EmployeeDao",EmployeeDao.class);
        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("Tanay");
        employee.setEmail("tanay.ojha@yash.com");
        int insert = employeeDao.insert(employee);
        System.out.println("Employee Inserted Done -> \n"+insert);
    }
}
