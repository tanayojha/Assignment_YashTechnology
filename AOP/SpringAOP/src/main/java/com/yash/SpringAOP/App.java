package com.yash.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/SpringAOP/config.xml");
        PaymentService bean = context.getBean("payment",PaymentService.class);
        bean.makePayment();
    }
}
