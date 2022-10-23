package com.yash.otbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.otbs.model.User;

public interface AdminRepo extends JpaRepository<User, Integer>  {

}
