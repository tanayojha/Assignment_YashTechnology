package com.yash.SpringcoreAss1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
/*
 * A Model class “Employee” has the below properties
• empId – String – E.g.: Y001
• empName – String – E.g.: Yash
• empRole – String – E.g.: Trainee
• Create a spring xml configuration file to create a bean entry
for the Employee object with some sample property values
The client program should be able to display all the details of
the Movie object on the console.
2.
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Employee e = (Employee) context.getBean("employee");
        System.out.println(e);
    }
}
