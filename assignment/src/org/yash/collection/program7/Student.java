package org.yash.collection.program7;

import java.util.ArrayList;
import java.util.List;

public class Student {
	int rollNo;
	String stdName;//student name
	String className;//class name
	List<Double> marks = new ArrayList<Double>();

	//Mark obtainedMarks;// total marks	
	//double totalMarks;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String stdName, String className, List<Double> marks) {
		super();
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.className = className;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Double> getMarks() {
		return marks;
	}

	public void setMarks(List<Double> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stdName=" + stdName + ", className=" + className + ", marks=" + marks
				+ "]";
	}

	
	
	
}
