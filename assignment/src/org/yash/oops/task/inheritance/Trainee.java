package org.yash.oops.task.inheritance;

/**
 * 
 * @author tanay.ojha Here in this class we try to demonstrate the procedure in
 *         which Java Inheritance works.
 *
 */

/*
 * Trainee is a child class of Parent class Training due to Java Inheritance
 * Method overloading is also achived
 * 
 */
public class Trainee extends Training {

	static String trainee_name = "Tanay";
	double trainee_experience = 0;
	final static String trainee_designation = "Software Engineer";

	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	public Trainee(double trainee_experience) {
		super();
		this.trainee_experience = trainee_experience;
		// System.out.println("Designation: "+trainee_designation+" Exp:
		// "+trainee_experience);
	}

	//child class methods
	void doCoding() {
		System.out.println("Task: writing programs of assignment");
	}

	//child class methods
	void useProjector() {
		System.out.println("Note: incase of offline training Projecter will be available");
	}

	//overloaded child class methods
	void trainingDetails(Training training) {
		System.out.println("Name: "+training.mentor_name);
		System.out.println("Name: "+training.no_of_trainees);
		System.out.println("Name: "+training.training_name);
		System.out.println("Name: "+training.duration);
		System.out.println("Name: "+training.keyboard_status);
		System.out.println("Name: "+training.trainee_status);
	}

	//overloaded child class methods
	void trainingDetails(String trainee_name) {
		System.out.println("Name of the trainee is: "+trainee_name);
	}
	
	//overloaded child class methods
	void trainingDetails(String trainee_name, double trainee_experience,String trainee_designation) {
		System.out.println("Name of the trainee is: "+trainee_name+""
				+ "\n Trainee experience is :"+trainee_experience+"\n Trainee designation is: "+trainee_designation);
	}

	public static void main(String[] args) {
		Trainee t = new Trainee(2.5);
		t.trainingProvidedBy("Snehal Pawar");//overloading from Parent classes
		t.useClassRoom(0);//overloading from Parent class
		t.doCoding();//child class method
		t.useProjector();//child class method
	
	}

}
