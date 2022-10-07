package org.yash.oops.assignment.program8;
/**
 * 
 * @author tanay.ojha
 *
 */
public class Laptop extends Electronics {
	static String id_lap = "lapId";
	static String sc_lap = "carbon plastic";
	static String dom_lap = "08/09/2022";
	public static void main(String[] args) {
		Electronics electronics = new Electronics();
		String id = electronics.id;
		String sc = electronics.semiconductorType;
		String dom = electronics.dateOfManufacturing;
		System.out.println(id + " " + sc + " " + dom);
		Electronics lap = new Laptop();
		lap.id = id_lap;
		lap.semiconductorType = sc_lap;
		lap.dateOfManufacturing = dom_lap;
		System.out.println(lap.id + " " + lap.semiconductorType + " " + lap.dateOfManufacturing );
	}
}
