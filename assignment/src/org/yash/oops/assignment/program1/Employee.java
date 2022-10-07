package org.yash.oops.assignment.program1;
/**
 * 
 * @author tanay.ojha
 *
 */
public class Employee extends Person {
	private int salary;
	private String date_of_joining;
	private String base_location;
	private String deptobj;
	private String contactno;
	private String emailid;
	Department department;

	public Employee(String pid, String pname, String paddress, String dob, int salary, String date_of_joining,
			String base_location,String contactno, String emailid,Department department) {
		super(pid, pname, paddress, dob);
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.contactno = contactno;
		this.emailid = emailid;
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public String getDeptobj() {
		return deptobj;
	}

	public void setDeptobj(String deptobj) {
		this.deptobj = deptobj;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", date_of_joining=" + date_of_joining + ", base_location="
				+ base_location + ", deptobj=" + deptobj + ", contactno=" + contactno + ", emailid=" + emailid
				+ ", department=" + department + "]";
	}

	
	
	
	
	
	
}
