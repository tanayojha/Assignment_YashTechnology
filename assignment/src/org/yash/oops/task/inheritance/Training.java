package org.yash.oops.task.inheritance;

/*
 * This is a Parent class of child class trainee
 */
public class Training {

	int no_of_trainees = 18;// (instance variable) no of trainees attended
	static int duration = 25;// (class variable) training days
	String training_name;// training topic eg- Java, Nodejs etc
	String mentor_name;
	// for status checking
	boolean trainee_status = false;
	boolean keyboard_status = false;

	public Training() {
		System.out.println("- Training Details -");
	}

	public Training(int no_of_trainees, String training_name, String mentor_name, boolean trainee_status,
			boolean keyboard_status) {
		super();
		this.no_of_trainees = no_of_trainees;
		this.training_name = training_name;
		this.mentor_name = mentor_name;
		this.trainee_status = trainee_status;
		this.keyboard_status = keyboard_status;
	}

	void trainingProvidedBy(String mentor_name) {
		System.out.println("Trainig given by: " + mentor_name);
	}

	
	void useClassRoom(int code) {

		switch (code) {
		case -1:
			System.out.println("Message: National Holiday");
			break;
		case 0:
			System.out.println("Message: Classroom will be Online");
			break;
		case 1:
			System.out.println("Message: Work From Home");
			break;
		case 2:
			System.out.println("Message: Approved Leave");
			break;
		default:
			System.out.println("Message: Week Off");
		}
	}

}
