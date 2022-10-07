package org.yash.oops.task.polymorphism;

public class TraineeRecord {
	
	String trainee_name;// training topic eg- Java, Nodejs etc
	// for status checking
	boolean trainee_status = false;
	boolean keyboard_status = false;
	
	public TraineeRecord() {
		System.out.println("- Trainee Attendance Record -");
	}

	public TraineeRecord(String trainee_name, boolean trainee_status, boolean keyboard_status) {
		super();
		this.trainee_name = trainee_name;
		this.trainee_status = trainee_status;
		this.keyboard_status = keyboard_status;
	}
	
	protected void trainingAttendance(String training_name, boolean trainee_status) {
		System.out.println("This method help us to mark att");
	}


	protected void useKeyboard(boolean keyboard_status) {
		System.out.println("System Status -");
	}

	
	
}
