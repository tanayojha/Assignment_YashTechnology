/**
 * 
 */
package com.yash.junit.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.yash.junit.advanced.Application;

/**
 * @author tanay.ojha
 *
 */
public class ApplicationService {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many application you want to add?");
		int no_of_record = scan.nextInt();
		Application[] app = new Application[no_of_record];
		for (int i = 0; i < app.length; i++) {
			Application apc = new Application();
			System.out.println("Enter Application Id ->");
			String appId = scan.next();
			apc.setAppId(appId);
			System.out.println("Enter Application Name ->");
			String appName = scan.next();
			apc.setAppName(appName);
			app[i] = apc;
		}
		//Requirement 1
		addApplication(app);

	}

	/*
	 * Requirement 1 creating Application by user Input
	 */
	public static String addApplication(Application[] app) {
		// Adding aaplication
		List<Application> asList = Arrays.asList(app);
		ArrayList<Application> arrayList = new ArrayList<Application>();
		for (int i = 0; i < asList.size(); i++) {
			arrayList.add(new Application(asList.get(i).getAppId(),asList.get(i).getAppName()));
		}
		System.out.println("Your Entered Record is :\n"+arrayList.toString());
		return arrayList.toString();
	}
	
	

	
}
