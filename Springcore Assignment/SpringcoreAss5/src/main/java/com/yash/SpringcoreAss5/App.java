package com.yash.SpringcoreAss5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
/*
 * Create a class called SetterMessage with a single member
variable called message which is initialized with null.
Instantiate this class using Inversion control and test[
Perform Setter Injection ]
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
        SetterMessage sm = (SetterMessage) ac.getBean("message");
        System.out.println(sm);
    }
}
