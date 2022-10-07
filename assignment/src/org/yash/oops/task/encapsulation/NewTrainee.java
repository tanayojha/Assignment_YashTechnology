package org.yash.oops.task.encapsulation;

/**
 * 
 * @author tanay.ojha
 *
 */

/*
 * 
 * Here we are trying to demonstrate the working of Encapsulation
 * where all are data members which are private which cannot be directly accessible
 * hence Getter & Setter method are also there to access them
 * 
 */

public class NewTrainee{
	
	private String name;
	private String designation;
	private double experience;
	private String attendance;
	private double duration_in_yash;
	private String pool;
	
	public NewTrainee() {
		// TODO Auto-generated constructor stub
	}
	
	public NewTrainee(String name, String designation, double experience, String attendance, double duration_in_yash,String pool) {
		this.name = name;
		this.designation = designation;
		this.experience = experience;
		this.attendance = attendance;
		this.duration_in_yash = duration_in_yash;
		this.pool = pool;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public double getDuration_in_yash() {
		return duration_in_yash;
	}

	public void setDuration_in_yash(double duration_in_yash) {
		this.duration_in_yash = duration_in_yash;
	}

	public String getPool() {
		return pool;
	}

	public void setPool(String pool) {
		this.pool = pool;
	}

	@Override
	public String toString() {
		return "NewTrainee [getName()=" + getName() + ", getDesignation()=" + getDesignation() + ", getExperience()="
				+ getExperience() + ", getAttendance()=" + getAttendance() + ", getDuration_in_yash()="
				+ getDuration_in_yash() + ", getPool()=" + getPool() + "]";
	}
	
	

	
	
	
	
	
	

}
