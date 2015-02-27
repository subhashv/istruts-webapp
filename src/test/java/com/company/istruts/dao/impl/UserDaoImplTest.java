package com.company.istruts.dao.impl;

import org.junit.Test;

import com.company.istruts.dao.UserDao;
import com.company.istruts.domain.User;

public class UserDaoImplTest {

	@Test
	public void testCreateUser(){
		
		UserDao dao = new UserDaoImpl();
		User user = new User();
		dao.createUser(user);
	}
}
