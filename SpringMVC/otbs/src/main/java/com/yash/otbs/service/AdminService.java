package com.yash.otbs.service;

import com.yash.otbs.model.User;

public interface AdminService {
	public User findUserDetailByUsernameAndpassword(String username, String password);
}
