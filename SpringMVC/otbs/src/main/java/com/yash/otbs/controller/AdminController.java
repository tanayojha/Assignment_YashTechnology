package com.yash.otbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yash.otbs.model.User;
import com.yash.otbs.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/admin")
	public void doLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		User user = adminService.findUserDetailByUsernameAndpassword(username, password);
	}
	
	

}
