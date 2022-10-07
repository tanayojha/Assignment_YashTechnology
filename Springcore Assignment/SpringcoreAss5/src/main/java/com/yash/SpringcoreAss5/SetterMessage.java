package com.yash.SpringcoreAss5;

public class SetterMessage {
	private String message = "";

	public SetterMessage(String message) {
		super();
		this.message = message;
	}
	
	public SetterMessage() {
	
	}
	

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "SetterMessage [message=" + message + "]";
	}
	
	
}
