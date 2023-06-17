package com.userService.dao;

import org.springframework.stereotype.Repository;

import com.userService.entities.User;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	
	public Optional<User> findById(Long id);

	public Optional<User> findByName(String name);
}



