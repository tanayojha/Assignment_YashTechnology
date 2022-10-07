package org.yash.oops.assignment.program2;

/**
 * 
 * @author tanay.ojha 
 * Here we are only taking one vertex (i.e side) of a square due to
 * square property all sides of square are equal i.e AB = BC = CD = AD;
 * So, here we are consider only one vertex. 
 *
 */
public class Square implements Shape {

	private double vertex;
	

	public Square(double vertex) {
		this.vertex = vertex;
	}

	@Override
	public double area() {
		// As per the Square Math Formula
		// Area = length * breadth
		return vertex * vertex;
	}
	
	public double printArea() {
		//As per the Maths Formula
		//Perimeter of a Square is 4 * a (side);
		return 4 * vertex;
	}

	@Override
	public String toString() {
		return "Area of a Square ABCD is " + area()+ " sqrm \nAnd print area of Square ABCD is " + printArea() + " m";
	}
}
