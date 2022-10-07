package com.yash.SpringcoreAss3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
/*
 * 3. Create an abstract parent class called Shape with an abstract
draw method and create subclasses of this class like Rectangle,
Triangle and Parallelogram. Define a simple java class called
DrawShape, which will instantiate an object depending on the
dependency injection and calls appropriate draw method.
 */
public class DrawShape 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Rectangle r = (Rectangle) context.getBean("rectangle");
        r.draw();
        Triangle t = (Triangle) context.getBean("triangle");
        t.draw();
        Parllelogram p = (Parllelogram) context.getBean("parllelogram");
        p.draw();
    }
}
