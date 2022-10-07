package com.yash.SpringcoreAss2;

public class PrintMessage {
	
	private String message = "Yash";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PrintMessage [message=" + message + "]";
	}
	
	

}
