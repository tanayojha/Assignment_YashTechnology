
package com.yash.SpringcoreAss2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.SpringcoreAss2.PrintMessage;

/**
 * Hello world!
 *
 */
/*
 * Create a class called PrintMessage with a single member
variable called message which is initialized with a default value
"Yash". Instantiate this class and test
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        PrintMessage  b =  (PrintMessage) context.getBean("printmessage");
        
        System.out.println(b);
       
    }
}
