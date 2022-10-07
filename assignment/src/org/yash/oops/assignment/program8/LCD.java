package org.yash.oops.assignment.program8;
/**
 * 
 * @author tanay.ojha
 *
 */
public class LCD extends Electronics {
	static String id_ = "lcdId";
	static String sc_ = "liquid crystal diode";
	static String dom_ = "01/09/2022";
	public static void main(String[] args) {
		Electronics electronics = new Electronics();
		String id = electronics.id;
		String sc = electronics.semiconductorType;
		String dom = electronics.dateOfManufacturing;
		System.out.println(id + " " + sc + " " + dom);
		Electronics lcd = new LCD();
		lcd.id = id_;
		lcd.semiconductorType = sc_;
		lcd.dateOfManufacturing = dom_;
		System.out.println(lcd.id + " " + lcd.semiconductorType + " " + lcd.dateOfManufacturing );
	}
}
