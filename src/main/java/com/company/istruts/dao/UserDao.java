package com.company.istruts.dao;

import java.util.List;

import com.company.istruts.domain.User;

public interface UserDao {

	public String createUser(User user);
	
	public String updateUser(User user);
	
	public List<User> findAllUsers(User user);
	
	public String deleteUser(Integer userId);
	
	public User viewUserById(Integer userId);
	
	public String authentication(String userName, String password);
	
}
