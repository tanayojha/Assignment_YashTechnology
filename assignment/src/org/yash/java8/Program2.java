package org.yash.java8;

/**
 * 
 * @author tanay.ojha WAP to check the given sequence of character in given
 *         string. Suppose that you are given following string “Taj is situated
 *         in Agra.” And you have to find following sequence AST. AST should be
 *         one after another. If you found sta, or tas, or tsa it should print
 *         string not found.
 * 
 */
@FunctionalInterface
interface FindString {
	void find(String str);
}

public class Program2 {

	public static void main(String[] args) {

		String str1 = "Taj mahal is situated in Agra";
		String str2 = "Tasj mahal is situsated in Agrast";

		FindString fs = (s) -> {
			if (s.contains("ast") || s.contains("sta") || s.contains("tas") || s.contains("tsa")) {
				System.out.println("String found");
			} else {
				System.out.println("String not found");
			}
		};
		fs.find(str1);

	}

}
