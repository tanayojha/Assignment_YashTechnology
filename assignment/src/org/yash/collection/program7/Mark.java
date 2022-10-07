package org.yash.collection.program7;

import java.util.ArrayList;
import java.util.List;

public class Mark {
	
	List<String> marks = new ArrayList<String>();
	

	public List<String> getMarks() {
		return marks;
	}

	public void setMarks(List<String> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Mark [marks=" + marks + "]";
	}
		
		
}
