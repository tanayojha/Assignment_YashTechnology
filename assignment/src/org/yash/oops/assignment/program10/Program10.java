package org.yash.oops.assignment.program10;

/**
 * 
 * @author tanay.ojha 
 * 		   WAP to demonstrate the use of clone method. 
 * 		   Clone one object of Product class :- pid, pname, price and unitOfMeasurement.
 *         When you clone object of class Product change the product name and
 *         price. With the help of instanceOf check that the newly created
 *         object is belong to Product class or not.
 *
 *
 */
public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Product original = new Product("101", "Salt", 100, "KG");

			Product copy = original.clone();
			copy.setPname("Sugar");
			copy.setPrice(50);

			if (copy instanceof Product) {
				System.out.println("copy = " + copy.getPname() + " - " + copy.getPrice());
			} else {
				System.out.println("original = " + original.getPname() + " - " + original.getPrice());
			}

			// System.out.println("original= " + original);
			// System.out.println("copy= " + copy);
		}

		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
