/**
 * 
 */
package com.yash.junit.intermediate;

/**
 * @author tanay.ojha
 *
 */
public class Book {

	private String Book_Name;
	private double Book_Price;
	private String Book_Type;
	private boolean flag_written;

	/**
	 * 
	 */
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String book_Name, double book_Price, String book_Type, boolean flag_written) {
		super();
		this.Book_Name = book_Name;
		this.Book_Price = book_Price;
		this.Book_Type = book_Type;
		this.flag_written = flag_written;
	}

	public boolean isFlag_written() {
		return flag_written;
	}

	public void setFlag_written(boolean flag_written) {
		this.flag_written = flag_written;
	}

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public double getBook_Price() {
		return Book_Price;
	}

	public void setBook_Price(double book_Price) {
		Book_Price = book_Price;
	}

	public String getBook_Type() {
		return Book_Type;
	}

	public void setBook_Type(String book_Type) {
		Book_Type = book_Type;
	}

	@Override
	public String toString() {
		return "Book [Book_Name=" + Book_Name + ", Book_Price=" + Book_Price + ", Book_Type=" + Book_Type + "]";
	}

}
