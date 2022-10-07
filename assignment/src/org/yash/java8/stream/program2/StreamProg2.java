
package org.yash.java8.stream.program2;

/**
 * @author tanay.ojha
 * Note:- student who score more than 40 will promoted to next class
1. WAP to print list of all students who’s total marks are less than 40%.
2. WAP to print list of all those students who scored more than 75% in any of 3 subjects.
3. WAP to print list of all those students who scored more than 75% in all subjects.
4. WAP to find those students who are fail in at least one subject.
5. Find how many students are promoted to another class.
6. Find how many students need to give exam in two subjects to promoted to another class.
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.text.html.HTMLEditorKit.Parser;

public class StreamProg2 {
	
	static Map<Student, Integer> studentMap;

	public static void main(String[] args) {
		
		
		

		ArrayList<Student> studentList = new ArrayList<Student>();
		//
		listOFStudent(studentList);
		// 1. WAP to print list of all students who’s total marks are less than 40%.
		List<Student> list = studentMap.entrySet().stream().filter(s -> s.getValue() < 40).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("List of all students who’s total marks are less than 40% are\n" + list +"\n");
		//3.WAP to print list of all those students who scored more than 75% in all subjects.
		List<Student> list2 = studentMap.entrySet().stream().filter(s -> s.getValue() > 75).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("List of all those students who scored more than 75% in all subjects are\n" + list2 +"\n");
		//2.WAP to print list of all those students who scored more than 75% in any of 3 subjects.
		//studentMap.entrySet().stream().filter(s -> s.getValue() > 75).map(Map.Entry::getKey);	
		//4.WAP to find those students who are fail in at least one subject.
		

	}

	private static void listOFStudent(ArrayList<Student> studentList) {
		Student aayush = new Student(101, LocalDateTime.now(), LocalDateTime.of(1990, 8, 25, 4, 5), 88, 85, 86, 87, 88,
				"10th");
		Student bhagat = new Student(102, LocalDateTime.now(), LocalDateTime.of(1992, 2, 26, 5, 5), 34, 35, 35, 36, 35,
				"10th");
		Student chandan = new Student(103, LocalDateTime.now(), LocalDateTime.of(1995, 11, 6, 2, 8), 43, 44, 45, 46, 47,
				"10th");
		Student divyesh = new Student(104, LocalDateTime.now(), LocalDateTime.of(1994, 12, 18, 3, 9), 40, 34, 35, 33,
				78, "10th");
		Student eminem = new Student(105, LocalDateTime.now(), LocalDateTime.of(1992, 10, 16, 1, 5), 48, 75, 92, 65, 27,
				"10th");
		Student farhan = new Student(106, LocalDateTime.now(), LocalDateTime.of(1990, 9, 19, 1, 6), 33, 55, 66, 88, 77,
				"10th");
		Student gaurav = new Student(107, LocalDateTime.now(), LocalDateTime.of(1991, 8, 20, 1, 7), 49, 59, 69, 89, 79,
				"10th");
		Student harsh = new Student(108, LocalDateTime.now(), LocalDateTime.of(1992, 7, 22, 1, 8), 95, 45, 65, 85, 75,
				"10th");
		Student iktara = new Student(109, LocalDateTime.now(), LocalDateTime.of(1993, 5, 21, 1, 9), 34, 10, 36, 33, 23,
				"10th");
		Student jhony = new Student(109, LocalDateTime.now(), LocalDateTime.of(1993, 5, 21, 1, 9), 23, 20, 43, 53, 63,
				"10th");

		int avgAayush = (aayush.getMaths() + aayush.getPhysics() + aayush.getChemistry() + aayush.getEnglish()
				+ aayush.getHindi()) / 5;
		int avgBhagat = (bhagat.getMaths() + bhagat.getPhysics() + bhagat.getChemistry() + bhagat.getEnglish()
				+ bhagat.getHindi()) / 5;
		int avgChandan = (chandan.getMaths() + chandan.getPhysics() + chandan.getChemistry() + chandan.getEnglish()
				+ chandan.getHindi()) / 5;
		int avgDivyesh = (divyesh.getMaths() + divyesh.getPhysics() + divyesh.getChemistry() + divyesh.getEnglish()
				+ divyesh.getHindi()) / 5;
		int avgEminem = (eminem.getMaths() + eminem.getPhysics() + eminem.getChemistry() + eminem.getEnglish()
				+ eminem.getHindi()) / 5;
		int avgFarhan = (farhan.getMaths() + farhan.getPhysics() + farhan.getChemistry() + farhan.getEnglish()
				+ farhan.getHindi()) / 5;
		int avgGaurav = (gaurav.getMaths() + gaurav.getPhysics() + gaurav.getChemistry() + gaurav.getEnglish()
				+ gaurav.getHindi()) / 5;
		int avgHarsh = (harsh.getMaths() + harsh.getPhysics() + harsh.getChemistry() + harsh.getEnglish()
				+ harsh.getHindi()) / 5;
		int avgIktara = (iktara.getMaths() + iktara.getPhysics() + iktara.getChemistry() + iktara.getEnglish()
				+ iktara.getHindi()) / 5;
		int avgJhony = (jhony.getMaths() + jhony.getPhysics() + jhony.getChemistry() + jhony.getEnglish()
				+ jhony.getHindi()) / 5;

		studentMap = new HashMap<Student, Integer>();

		studentMap.put(aayush, avgAayush);
		studentMap.put(bhagat, avgBhagat);
		studentMap.put(chandan, avgChandan);
		studentMap.put(divyesh, avgDivyesh);
		studentMap.put(eminem, avgEminem);
		studentMap.put(farhan, avgFarhan);
		studentMap.put(gaurav, avgGaurav);
		studentMap.put(harsh, avgHarsh);
		studentMap.put(iktara, avgIktara);
		studentMap.put(jhony, avgJhony);
	}

}
