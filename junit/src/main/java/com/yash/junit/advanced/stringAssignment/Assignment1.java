/**
 * 
 */
package com.yash.junit.advanced.stringAssignment;

/**
 * @author tanay.ojha
 *
 */
/*
 * Create a class Document Create two fields in this as title and filepath
 * Create appropriate getter and setter methods Create showDocumentInformation()
 * method that should return one String value as “{title:java basics,
 * filepath:c:/document/corejava/basics/introduction.pdf}” · attempt it with
 * Test first approach.
 */
public class Assignment1 {

	static Document doc ;
	
	/**
	 * 
	 */
	public Assignment1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doc = new Document("javabasics", "c:/document/corejava/basics/introduction.pdf");
		showDocumentInformation(doc.getTitle(),doc.getFilePath());
	}
	
	public static String showDocumentInformation(String title, String filePath){
		return title+","+filePath;
		//return "{title:javabasics, filepath:c:/document/corejava/basics/introduction.pdf}";
	}

}
