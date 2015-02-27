package com.company.istruts.service.impl;

import com.company.istruts.dao.UserDao;
import com.company.istruts.dao.impl.UserDaoImpl;
import com.company.istruts.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public String auth(String userName, String password) {
		
		UserDao dao = new UserDaoImpl();
		String message = dao.authentication(userName, password);
		return message;
	}

}
