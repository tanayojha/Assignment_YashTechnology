package org.yash.oops.task.polymorphism;

/**
 * 
 * @author tanay.ojha
 * Here in this class we try to demonstrate the 
 * procedure in which Java Polymorphism works or we can say Method Overiding.
 *
 */

/*
 * Trainee is a child class of Parent class Training
 * due to Java Polymorphism Method Overriding & Overloading both can be achived
 * 
 */
public class Trainee extends TraineeRecord {
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	
	//Method Overriding from Parent class
	@Override
	protected void trainingAttendance(String training_name, boolean trainee_status) {
		// TODO Auto-generated method stub
		if (trainee_status) 
			System.out.println("Name: " +training_name + " (Present)"); 
		else System.out.println("Name: " +
			training_name + " (Absent)");
	}
	
	//Method Overriding from Parent class
	@Override
	protected void useKeyboard(boolean keyboard_status) {
		// TODO Auto-generated method stub
		if (keyboard_status)
			 System.out.println("Status: Online"); 
		else
			 System.out.println("Status: Offline");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee t = new Trainee();
		t.trainingAttendance("Tanay",true);
		t.useKeyboard(true);
	}

}
