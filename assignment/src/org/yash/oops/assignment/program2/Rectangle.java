package org.yash.oops.assignment.program2;

/**
 * 
 * @author tanay.ojha
 * Here we are only taking two vertexe of a rectangle due to
 * rectangle property two opposite sides of rectangle are equal i.e AB = BC & CD = AD;
 * So, here we are consider only two vertex. 
 *
 */
public class Rectangle implements Shape  {
	
	private double vertex_AB;//side AB = CD
	private double vertex_BC;//side BC = AD 
	
	public Rectangle(double vertex_AB,double vertex_BC) {
		this.vertex_AB = vertex_AB;
		this.vertex_BC = vertex_BC;
	}

	@Override
	public double area() {
		//As per maths formula 
		//Area of rectangle = length * breadth;
		return vertex_AB * vertex_BC;
	}
	
	public double printArea() {
		//As per the Maths Formula
		//Perimeter of a rectangle is 2 * (l + B);
		return 2 * (vertex_AB + vertex_BC);
	}
	
	@Override
	public String toString() {
		return "Area of a Rectangle ABCD is " + area()+ " sqrm \nAnd print area of Rectangle ABCD is " + printArea() + " m";
	}
}
