package org.yash.oops.assignment.program5;

/**
 * @author tanay.ojha
 *		   Create class CalcAbs which is an abstract class it will
 *         have following methods:- 
 *         void sum(int a, int b); 
 *         void sub(int a, int b);
 *         void mul(int a, int b);
 *         void div(int a,int b); 
 *         You have to perform multilevel inheritance where at each level one method of CalcAbs will be overridden 
 *         by the child class 
 *         for example:- 
 *         Class CalcAbs Clsss A extends CalcAbs 
 *         { 
 *         it will override sum
 *         } 
 *         Class B extends A 
 *         {
 *         it will override sub
 *         }
 *         Class C extends B 
 *         {
 *         it will override mul
 *         } 
 *         Class D extends C 
 *         {
 *         it will override div
 *         }
 *         At the fourth level you
 *         have to create object and call all methods and print the results for
 *         all operations.
 */
public class DClass extends CClass {
	
	public DClass() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The Division is :"+(a*b));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DClass d = new DClass();
	
		d.div(10, 2);
		d.mul(24, 32);
		d.sub(32, 23);
		d.sum(43, 34);
	}

}
