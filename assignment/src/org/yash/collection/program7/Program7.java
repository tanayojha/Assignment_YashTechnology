package org.yash.collection.program7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author tanay.ojha WAP to store the student class objects in List. Student
 *         class structure :- Student{ int rollno; String sname, classname;
 *         String totalmarks; // marks out of 500, total five subjects each
 *         subject marks 100. } On the basis of the detail entered by the user.
 *         Now you have to perform the following operations. a) Print the name
 *         of students who secure first, second and third position. b) Print
 *         name of those students who’s marks are below 50% c) Print name of
 *         those students who’s marks are below 35% it means they are fail. d)
 *         Print name of those students who’s marks are above average score. e)
 *         Print detail of all students on the basis of Name
 * 
 */

public class Program7 {
	private static List<Student> studentList;
	private static List<Double> newMarkList;
	private static Map<Integer,Double> stdmap;


	public static void main(String[] args) throws Exception {
		Student student = null;
		// Taking Input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of record -");
		int no_of_record = scanner.nextInt();
		// Creating list of Student
		studentList = new ArrayList<Student>();
		// Method calling
		enterRecords(scanner, no_of_record, student);
		// Method calling
		calculateRank(student);
		//
		calculatePerc();
	}

	private static void enterRecords(Scanner s, int no_of_record, Student student) {
		for (int i = 0; i <= no_of_record - 1; i++) {
			student = new Student();
			// rollno
			System.out.println("Enter the rollNo -");
			int rollno = s.nextInt();
			student.setRollNo(rollno);// rollno set
			// student name
			System.out.println("Enter the Student Name -");
			String sname = s.next();
			student.setStdName(sname);
			// classname
			// System.out.println("Enter the Class Name -");
			// String cname = s.next();
			// student.setClassName(cname);
			// Marks
			System.out.println("Enter the totalMarks -");
			// Getting input of 5 subjects
			// Mark mark = new Mark();
			List<Double> mlist = new ArrayList<Double>();
			for (int j = 0; j < 5; j++) {
				System.out.println("Enter marks in subject " + (j + 1));
				double totalMarks = s.nextDouble();
				mlist.add(totalMarks);
			}
			// mark.setMarks(mlist);
			// student.setObtainedMarks(mark);
			student.setMarks(mlist);
			studentList.add(student);
			System.out.println("Enter the next record " + (i + 2));
		}

		// studentList.add(student);
		System.out.println("The Student List is - " + studentList + "\n");

	}

	private static void calculateRank(Student student) throws Exception {

		double total = 0;
		double totalMark = 0;
		newMarkList = new ArrayList<Double>();

		if (studentList != null && studentList.size() > 0) {
			for (int i = 0; i < studentList.size(); i++) {
				for (int j = 0; j < studentList.get(i).getMarks().size(); j++) {
					double obtainedMarks = studentList.get(i).getMarks().get(j);
					total += obtainedMarks;
					System.out.println("Total " + total);
				}
				totalMark = (total / 500) * 100;
				System.out.println("Total Mark " + totalMark);
				newMarkList.add(totalMark);
				total = 0;
				totalMark = 0;
				System.out.println("New Total Marks get by Student " + newMarkList.toString());
			}

			// Now we will find which student is 1st, 2nd & 3rd
			// Collections.sort(studentList, new Comparator<Student>().compare(student,
			// student));
			Collections.sort(newMarkList);
			Collections.reverse(newMarkList);
			System.out.println(newMarkList);
			

		} else {
			System.out.println("no data");
		}

	}

	private static void calculatePerc() {
		
		stdmap = new HashMap<Integer,Double>();
		for (int i = 0; i < studentList.size(); i++) {
			stdmap.put(studentList.get(i).rollNo, newMarkList.get(i));
		}
		
		
	}
}
