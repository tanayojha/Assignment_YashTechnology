/**
 * 
 */
package com.yash.junit.intermediate;

/**
 * @author tanay.ojha
 *
 */
public class Student {
	
	private int Student_ID;
	private String Student_Name;
	private String Student_class;
	private boolean flag_registered;

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int student_ID, String student_Name, String student_class, boolean flag_registered) {
		super();
		this.Student_ID = student_ID;
		this.Student_Name = student_Name;
		this.Student_class = student_class;
		this.flag_registered = flag_registered;
	}

	
	
	public boolean isFlag_registered() {
		return flag_registered;
	}

	public void setFlag_registered(boolean flag_registered) {
		this.flag_registered = flag_registered;
	}

	public int getStudent_ID() {
		return Student_ID;
	}

	public void setStudent_ID(int student_ID) {
		Student_ID = student_ID;
	}

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public String getStudent_class() {
		return Student_class;
	}

	public void setStudent_class(String student_class) {
		Student_class = student_class;
	}
	
	

}
