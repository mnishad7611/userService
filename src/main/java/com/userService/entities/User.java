package com.userService.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="user_table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id ;
	private String name;
	private String city;
	private String profile;

	public User(){

	}

	public void setId(Long id){
		this.id=id;
	}
	
	public Long getId(){
		return id;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return city;
	}
	public void setProfile(String profile){
		this.profile=profile;
	}
	public String getProfile(){
		return profile;
	}
	@Override
	public String toString() {
		return ("User Id:"+id +" "+ "User name" + name +" "+ 
		"User City:"+city +" "+ "User Profile"+profile);		
	}
	
}
