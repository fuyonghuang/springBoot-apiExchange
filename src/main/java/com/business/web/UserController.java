package com.business.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.business.entity.User;
import com.business.service.UserService;

@RestController
public class UserController {


	@Autowired
	UserService userService;

    @RequestMapping("/hello")
    public User hello() {

    	return userService.findByName("david");
    }

}
