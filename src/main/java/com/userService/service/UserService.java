package com.userService.service;

import java.util.List;

import com.userService.entities.User;

public interface UserService {

	public String getName();

	public User createUser();

	public List<User> getUsers();

	public List<User> capsAllUsers();

	public User updateUser(long id, String city);

	public void delete(long id);
	

}