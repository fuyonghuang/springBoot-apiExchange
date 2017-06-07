package com.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.business.entity.User;
import com.business.mapper.UserMapper;
import com.business.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public User findByName(String name) {
		return userMapper.findByName(name);
	}

}
