package com.business.service;

import org.springframework.stereotype.Service;

import com.business.entity.User;



public interface UserService {

	User findByName(String name);
	
}
