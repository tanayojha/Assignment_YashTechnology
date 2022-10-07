package com.yash.SpringcoreAss1;
/**
 * 
 * @author tanay.ojha
 *
 */
public class Employee {
	String empId;
	String empName;
	String empRole;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
	}
	
	
	
	
}
