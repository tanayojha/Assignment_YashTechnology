package com.yash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/employee")
	public String employeeDetail(Model employee) {
		return "employee";
	}
	
	@RequestMapping("/employeeRegister")
	public String employeeRegister(Model employee) {
		employee.addAttribute();
		return "employee";
	}
	
}
