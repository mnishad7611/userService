package com.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userService.entities.User;
import com.userService.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	UserService userService;


	@GetMapping("/msg")
	public String getMsg(){
		return "Hey, How you doing ?";
	}

	@GetMapping("/getuser")
	public User getUser(){
		return userService.createUser();
	}

	@GetMapping("/getAllUser")
	public List<User> getAllUsers(){
		return userService.getUsers();

	}

	@GetMapping("/getUpdatedUser")
	public List<User> updatedNames(){
		return userService.capsAllUsers();
	}
	
}
