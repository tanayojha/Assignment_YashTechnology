package org.yash.oops.assignment.program2;

/**
 * 
 * @author tanay.ojha 
 * 			Create class/interface Shape which will have only one
 *         method area. Create class Triangle, Square and Rectangle all will
 *         extends/implements Shape. In class Triangle, Square and Rectangle
 *         depending upon the number of sides you have to react the co-ordinates
 *         of the vertex. For example triangle having three vertex so name each
 *         vertex A,B and C. now you have to read the x & y co-ordinates of A,B
 *         and C, after that you have find the distance between the vertex A, B
 *         and C after this you have to calculate the Area and print Area. Same
 *         process will be applied while calculating area of Square and
 *         Rectangle.
 */
public class Program2 {

	public static void main(String[] args) {
		// Square Area & print Area
		Square square = new Square(10.89);
		System.out.println(square.toString() + "\n");
		// Rectangle Area & print Area
		Rectangle rectangle = new Rectangle(25.12, 30.12);
		System.out.println(rectangle.toString() + "\n");
		// Triangle Area & print Area
		Triangle triangle = new Triangle(15.20, 20.20, 25.20);
		System.out.println(triangle.toString());
	}

}
