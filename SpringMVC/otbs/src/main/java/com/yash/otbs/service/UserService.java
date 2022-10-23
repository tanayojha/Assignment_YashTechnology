package com.yash.otbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.otbs.dao.UserRepository;
import com.yash.otbs.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public void saveUser(User user) {
		repository.save(user);
	}

	public User fetchUserByUserName(String username) {
		return repository.findByUsername(username);
	}

	public User fetchUserByUsernameAndPassword(String username, String password) {
		return repository.findByUsernameAndPassword(username, password);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	

}
