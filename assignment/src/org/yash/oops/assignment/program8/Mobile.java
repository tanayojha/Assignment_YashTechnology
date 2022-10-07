package org.yash.oops.assignment.program8;
/**
 * 
 * @author tanay.ojha
 *
 */
public class Mobile extends Electronics {
		
	static String id_ = "mId";
	static String sc_ = "Metallic";
	static String dom_ = "01/09/2022";
	public static void main(String[] args) {
		Electronics electronics = new Electronics();
		String id = electronics.id;
		String sc = electronics.semiconductorType;
		String dom = electronics.dateOfManufacturing;
		System.out.println(id + " " + sc + " " + dom);
		Electronics electr = new Mobile();
		electr.id = id_;
		electr.semiconductorType = sc_;
		electr.dateOfManufacturing = dom_;
		System.out.println(electr.id + " " + electr.semiconductorType + " " + electr.dateOfManufacturing );
		
	}
}
