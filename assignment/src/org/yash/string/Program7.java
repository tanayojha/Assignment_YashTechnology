package org.yash.string;
/**
 * 
 * @author tanay.ojha
 * WAP to demonstrate how garbage collector work when any memory is not referenced by string object.
 */
public class Program7 {
	
	String obj_name;
	
	public Program7(String obj_name) {
		// TODO Auto-generated constructor stub
		this.obj_name = obj_name;
	}
	
	public static void main(String[] args) {
		//object t1 inside method becomes unreachable when show() removed
		Program7 prog1 = new Program7("test1");
        //object t2 inside method becomes unreachable when display() removed
		Program7 prog2 = new Program7("test2");
		System.gc();
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
        System.out.println(this.obj_name + " successfully garbage collected");

	}
}
