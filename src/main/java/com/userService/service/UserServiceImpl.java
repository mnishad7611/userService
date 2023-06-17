package com.userService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userService.dao.UserRepository;
import com.userService.entities.User ;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String getName(){
			return "Monika" ;
		}

	@Override
	public User createUser(){

		User user = new User();
		user.setName("Monika Nishad");
		user.setCity("Dehradun");
		user.setProfile("Java Developer");

		User result = userRepository.save(user);
		return result;
	}

	@Override
	public List<User> getUsers(){
		List<User> users = (List<User>) userRepository.findAll();
        	return users;
	}
	
	@Override
	public List<User> capsAllUsers(){

		//List<User> users = (List<User>) userRepository.findAll();
		List<User> users = this.getUsers();
		for(User user : users){
			String updateName = user.getName();
			user.setName(updateName.toUpperCase());
		}
		return users;
	}


	public void delete(long id) {

	}


}
