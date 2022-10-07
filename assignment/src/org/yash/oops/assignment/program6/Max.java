package org.yash.oops.assignment.program6;

public class Max {
	protected double max(double a, double b, double c, double d) {

		double max = a;

	    if (b > max)
	        max = b;
	    if (c > max)
	        max = c;
	    if (d > max)
	        max = d;

	     return max;
	}
}
