package org.yash.oops.assignment.program8;

/**
 * 
 * @author tanay.ojha
 * 			Perform the following Inheritance map and print the
 *         details of each objects. 
 *         Electronics 
 *			\     \   \ 
 *         Mobile LCD Laptop Electornics
 *         class :- id, semiconductorType, dateOfManufacturing. 
 *         Mobile, LCD and Laptop will inherit class electronics
 *         you have to create object of
 *         Electronic class and instantiate with Mobile, LCD and Laptop class.
 *         And print the details accordingly.
 *
 */
public class Electronics {

	String id = "eId";
	String semiconductorType = "Silicon";
	String dateOfManufacturing = "23/09/2022";

	public Electronics() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public String toString() {
		return "Electronics [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}

}
