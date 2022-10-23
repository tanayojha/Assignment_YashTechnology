/**
 * 
 */
package com.yash.junit.advanced.stringAssignment;

/**
 * @author tanay.ojha
 *
 */
public class Document {
	
	private String title;
	private String filePath;

	/**
	 * 
	 */
	public Document() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @param title
	 * @param filePath
	 */
	public Document(String title, String filePath) {
		super();
		this.title = title;
		this.filePath = filePath;
	}



	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}



	@Override
	public String toString() {
		return "Document [title=" + title + ", filePath=" + filePath + "]";
	}
	
	

}
