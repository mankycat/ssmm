package com.marlboro.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marlboro.mapper.UserMapper;
import com.marlboro.model.User;

@Repository
public class UserDAO {
	
	@Autowired
	private UserMapper userMapper;

	public boolean register(User user) {
		return userMapper.insertUser(user) == 1 ? true : false;
	}

	public User login(String username, String password) {
		return userMapper.selectByUsernameAndPwd(username, password);
	}
}
