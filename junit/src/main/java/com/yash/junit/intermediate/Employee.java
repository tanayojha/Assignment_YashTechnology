/**
 * 
 */
package com.yash.junit.intermediate;

/**
 * @author tanay.ojha
 *
 */
public class Employee {
	
	
	private String emp_Name;
	private String emp_Designation;
	private int emp_ID;
	private boolean isWorking;

	/**
	 * 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String emp_Name, String emp_Designation, int emp_ID, boolean isWorking) {
		super();
		this.emp_Name = emp_Name;
		this.emp_Designation = emp_Designation;
		this.emp_ID = emp_ID;
		this.isWorking = isWorking;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public String getEmp_Designation() {
		return emp_Designation;
	}

	public void setEmp_Designation(String emp_Designation) {
		this.emp_Designation = emp_Designation;
	}

	public int getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	@Override
	public String toString() {
		return "Employee [emp_Name=" + emp_Name + ", emp_Designation=" + emp_Designation + ", emp_ID=" + emp_ID
				+ ", isWorking=" + isWorking + "]";
	}
	
	
}
