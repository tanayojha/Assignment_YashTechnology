package org.yash.oops.task.encapsulation;


/**
 * 
 * @author tanay.ojha
 *
 */
/*
 * This class is to Add a new trainee joined in a Training Program
 * using Encapsulation where we are not inherited the data instead 
 * we instantied our class and acess private members use setter & getter
 * 
 */
//outer class
public class AddTrainee{
	
	public NewTrainee newTrainee;

	 AddTrainee() {
		// TODO Auto-generated constructor stub
		//Intance creation and save or add data of new Trainee 
		newTrainee = new NewTrainee();
		newTrainee.setName("Rahul");
		newTrainee.setPool("Java");
		newTrainee.setAttendance("Present");
		newTrainee.setDesignation("Trainee Developer");
		newTrainee.setDuration_in_yash(6);
		newTrainee.setExperience(2.6);
		System.out.println("Adding New Trainee please wait...");

	}//close
	 
	 //inner classses to display
	 class GetTraineeData{
		 
		 	public GetTraineeData() {
				// TODO Auto-generated constructor stub
		 		System.out.println("- Display Trainee Data -");
			}
		 	
			//from above instance we getting or displaying new Trainee details using getters 
			public void display() {
				System.out.println(newTrainee.getAttendance());
				System.out.println(newTrainee.getDesignation());
				System.out.println(newTrainee.getDuration_in_yash());
				System.out.println(newTrainee.getExperience());
				System.out.println(newTrainee.getName());
				System.out.println(newTrainee.getPool());
			}
		} //close
	

	public static void main(String[] args) {
		// Here we are displaying our saved data using encapsulation
		new AddTrainee().new GetTraineeData().display();
	
	}//close
	
}//close


