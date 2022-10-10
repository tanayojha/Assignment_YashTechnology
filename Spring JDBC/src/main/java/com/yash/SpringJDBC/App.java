package com.yash.springjdbc;

import java.util.List;

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
        //employee.setId(102);
        //employee.setName("Dheerendra Kag");
        //employee.setEmail("dehrendra.kag@yash.com");
        
        //for inserting data into table
        //int insert = employeeDao.insert(employee);
        //System.out.println("Employee Inserted Done -> \n"+insert);
        
        //for updating data into table
        //int update = employeeDao.updateEmployeeName(employee);
        //int update2 = employeeDao.updateEmployee(employee);
        //System.out.println("Employee Updated Done -> \n"+update+"\n"+update2);
        
        
        //for deleting record from table on employee id basis
        // int deleteEmployee = employeeDao.deleteEmployee(employee.getId());
        //System.out.println("Employee Deleted Done ->\n"+deleteEmployee);
        
        //for getting Employee details on basis of employee id.
        //Employee employeeById = employeeDao.getEmployeeById(employee.getId());
        //System.out.println("Employee Details -> "+employeeById);
        
        //for getting All Employee details 
        List<Employee> allEmployeeDetails = employeeDao.getAllEmployeeDetails();
        System.out.println(allEmployeeDetails);
        
        
        
        
        
        
    }
}
