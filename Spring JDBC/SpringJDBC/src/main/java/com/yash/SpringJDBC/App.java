package com.yash.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.SpringJDBC.dao.EmployeeDao;
import com.yash.SpringJDBC.entities.Employee;


public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/SpringJDBC/applicationcontext.xml");
        EmployeeDao employeeDao = context.getBean("EmployeeDao",EmployeeDao.class);
        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("Tanay");
        employee.setEmail("tanay.ojha@yash.com");
        int insert = employeeDao.insert(employee);
        System.out.println("Employee Inserted Done -> \n"+insert);
    }
}
