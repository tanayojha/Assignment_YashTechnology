package org.yash.oops.assignment.program3;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * 
 * @author tanay.ojha
 *
 *         Create Class Customer which will have following class members: -
 *         CustId, accountno, custname, cust_address, cust_dob,
 *         cust_account_opening_date, Branch_Obj. Class Branch :- branch_id,
 *         branch_name, branch_address. Class Customer_Account_Statement:- CAID,
 *         CustId, amount, deposit_withdrawl, deposit_date. Now you have to
 *         create Customer, Branch and CustomerAccountStatement class object.
 *         CustomerAccountStatement will have multiple records as one customer
 *         will deposit and withdrawal the amount. So you need to print the
 *         statement as per the CustomerId. What is expected:- you will create
 *         multiple object of customer class. Also you have to create multiple
 *         object of the CustomerAccountStatement and while printing detail of
 *         CustomerAccountStatement you have to print detail of Customer.
 */
public class Program3 {
	Branch branch;
	Customer customer;
	Customer_Account_Statement custAccStatement;

	public Program3() {
		// TODO Auto-generated constructor stub
		System.out.println(" - Welcome to Customer Bank - ");
		System.out.println("******************************");
		System.out.println(" - Please choose an service -");
		System.out.println("----------------------------- ");
	}

	protected static void createCustomers() {

	}

	public static void main(String[] args) {
		// Just calling for Greetings!
		Program3 p3 = new Program3();
		// Firstly Create multiple Customer
		// PARENT
		Customer[] cusArray = new Customer[5];
		cusArray[0] = new Customer("CUST101", "1015089", "Tanay", "Indore", "25/08/1990", "01/09/2022",
				new Branch("BRH50", "Vijaynagar", "near vijaynagar square"));
		cusArray[1] = new Customer("CUST102", "1015088", "Prakash", "Indore", "5/05/1989", "01/09/2022",
				new Branch("BRH50", "Vijaynagar", "near vijaynagar square"));
		cusArray[2] = new Customer("CUST103", "1015087", "Deepak", "Indore", "15/12/1999", "01/09/2022",
				new Branch("BRH50", "Vijaynagar", "near vijaynagar square"));
		cusArray[3] = new Customer("CUST104", "1015086", "Roshni", "Indore", "30/01/1995", "01/09/2022",
				new Branch("BRH50", "Vijaynagar", "near vijaynagar square"));
		cusArray[4] = new Customer("CUST105", "1015085", "Ujwal", "Indore", "7/06/1988", "01/09/2022",
				new Branch("BRH50", "Vijaynagar", "near vijaynagar square"));
		// Firstly Create multiple Customer Account Statement
		// CHILD

		Customer_Account_Statement[] casArray = new Customer_Account_Statement[17];
		casArray[0] = new Customer_Account_Statement("CAI101", "CUST101", 0, 0, 0, null);// tanay
		casArray[1] = new Customer_Account_Statement("CAI101", "CUST101", 1000, 1000, 0, "01/09/2022");// tanay
		casArray[2] = new Customer_Account_Statement("CAI101", "CUST101", 800, 0, 200, null);// tanay
		casArray[3] = new Customer_Account_Statement("CAI101", "CUST101", 700, 0, 100, null);// tanay
		casArray[4] = new Customer_Account_Statement("CAI101", "CUST101", 500, 0, 200, null);// tanay
		casArray[5] = new Customer_Account_Statement("CAI102", "CUST102", 0, 0, 0, null);// Prakash
		casArray[6] = new Customer_Account_Statement("CAI102", "CUST102", 800, 800, 0, "05/09/2022");// Prakash
		casArray[7] = new Customer_Account_Statement("CAI102", "CUST102", 700, 0, 100, null);// Prakash
		casArray[8] = new Customer_Account_Statement("CAI103", "CUST103", 0, 0, 0, null);// Deepak
		casArray[9] = new Customer_Account_Statement("CAI103", "CUST103", 500, 500, 0, "02/09/2022");// Deepak
		casArray[10] = new Customer_Account_Statement("CAI103", "CUST103", 100, 0, 400, null);// Deepak
		casArray[11] = new Customer_Account_Statement("CAI103", "CUST103", 500, 400, 0, "05/09/2022");// Deepak
		casArray[12] = new Customer_Account_Statement("CAI104", "CUST104", 0, 0, 0, null);// Roshni
		casArray[13] = new Customer_Account_Statement("CAI104", "CUST104", 2000, 2000, 0, "1/09/2022");// Roshni
		casArray[14] = new Customer_Account_Statement("CAI104", "CUST104", 2700, 700, 0, "10/09/2022");// Roshni
		casArray[15] = new Customer_Account_Statement("CAI105", "CUST105", 0, 0, 0, null);// Ujwal
		casArray[16] = new Customer_Account_Statement("CAI105", "CUST105", 100, 100, 0, "1/09/2022");// Ujwal

		/*
		 * Operation perform taking Input by the user
		 */
		System.out.println("Please enter customer Id -> ");

		Scanner scan = new Scanner(System.in);
		String input1 = scan.next(); // reads line.

		for (int i = 0; i < cusArray.length; i++) {
			if (cusArray[i].getCust_id().equals(input1)) {
				System.out.println(cusArray[i].toString());
			}
		}

		// iterating value from CAS Array
		for (int j = 0; j < casArray.length; j++) {

			if (casArray[j].getCustId().equals(input1)) {
				System.out.println(casArray[j].toString());
			}
		}

	}

}
