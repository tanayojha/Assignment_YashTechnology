package org.yash.java8;

/**
 * 
 * @author tanay.ojha WAP to insert one string into another string. Also perform
 *         garbage collection when insertion is done.
 */

@FunctionalInterface
interface InsertString {
	String insert(String orignalString, String insertedString);
}

public class Program4 {
	private static String string;
	private static String str = "Yash";
	private static String insertStr = "Technologies";
	
	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		InsertString si = (s,is) -> {
		
			string = new String(s);
			String concat = string.concat(is);
			string = null;
			return concat;
		};
		System.out.println(""+si.insert(str, insertStr));
		System.gc();
        System.runFinalization();

	}
	
	@Override
		protected void finalize() throws Throwable {
			System.out.println(this.string +"free successfully");
			System.out.println(this.str +"free successfully");
			System.out.println(this.insertStr +"free successfully");


		}
}
