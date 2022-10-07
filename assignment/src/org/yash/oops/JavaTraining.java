package org.yash.oops;

/**
 * This class is created to explain encaplusation & polymorphic behaviour of Our
 * class.
 * 
 * @author tanay.ojha
 *
 */

public class JavaTraining {

	int no_ofTrainees;// number of traniees--instance varialble
	static int duration = 25;// time spenf for trang    
	String trngName;// name of the trng  

	public JavaTraining() {
		System.out.println("Default Constructor");
	}

	public JavaTraining(int duration) {
		System.out.println("That is a default constructor "+duration);
	}

	public JavaTraining(int duration,int no_ofTrainees) {
		System.out.println("duration of the trng"+duration+" no of traniees we have: "+no_ofTrainees);
	}

	/*
	 * method is used to display trng details     
	*/
	void usetrng() {
		System.out.println("Java fullstack traning");
	}

	/*
	* method is used to display keyboard  
	*/
	void useKeyboard() {
		System.out.println("Keyboard used");
	}
	
	/*
	* method is used to display which class room to use for trng
	*/
	void useClassRoom() {
		System.out.println("classroom used");
	}

	public static void main(String[] args) {
		JavaTraining javaTrng = new JavaTraining();
	}

}