package com.yash.SpringcoreAss4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
/*
 * 
 * Create a class called ConstructorMessage with a single member
variable called message which is initialized with null.The
class will have a parameterized constructor which initializes
the member variable called message. Instantiate this class
using Inversion control and test. [Perform Constructor
Injection]
5.
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext c = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	ConstructorMessage cm = (ConstructorMessage) c.getBean("e",ConstructorMessage.class);
    	System.out.println(cm);
        
    }
}
