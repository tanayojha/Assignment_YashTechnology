package com.yash.junit.intermediate;

import java.util.List;

/**
 * 
 * @author tanay.ojha
 *
 */
/*
 * Create a program for an Author to calculate the number of books he/she has
 * written. Book class has three attributes: Book_Name (String), Book_Price
 * (Double), Book_Type (String). Write methods to get and set above values of
 * the Student object. Also devise a way to calculate the number of books
 * written by the author.
 */
public class Program6 {
	public static long calculateNoOfBooks(List<Book> bookList) {
		long count = 0;
		for (Book book : bookList) {
			if (book.isFlag_written())
				count++;
		}

		return count;
	}
}
