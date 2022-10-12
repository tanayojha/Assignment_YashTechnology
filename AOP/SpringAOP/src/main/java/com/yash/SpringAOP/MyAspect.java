package com.yash.SpringAOP;

import java.util.Scanner;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.yash.SpringAOP.PaymentServiceImpl.makePayment())")
	public void authentication() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Secret Password ->");
		String sp = scan.next();
		if(sp!=null)
		{
				System.out.println("Authentication Done!");
		}
		else
		{
			System.out.println("Operation failed");
		}
		System.out.println("Payment Started");
	}


}
