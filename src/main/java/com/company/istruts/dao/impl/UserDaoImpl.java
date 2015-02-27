package com.company.istruts.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.company.istruts.dao.HibernateUtil;
import com.company.istruts.dao.UserDao;
import com.company.istruts.domain.User;

public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;
	
	public UserDaoImpl() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}
	@Override
	public String createUser(User user) {
		Session session = this.sessionFactory.openSession();
		session.saveOrUpdate(user);//Will Create a new record in the database
		return "SUCCESS";
	}

	@Override
	public String updateUser(User user) {
		Session session = this.sessionFactory.openSession();
		session.saveOrUpdate(user);//Will Create / Update the record in the database
		return "SUCCESS";
	}

	@Override
	public List<User> findAllUsers(User user) {
		Session session = this.sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);//FIXME write the code later for search criteria...
		return criteria.list();
	}

	@Override
	public String deleteUser(Integer userId) {
		Session session = this.sessionFactory.openSession();
		session.delete(userId);//WIll delete the record from database
		return "SUCCESS";
	}

	@Override
	public User viewUserById(Integer userId) {
		Session session = this.sessionFactory.openSession();
		User user = (User)session.load(User.class, userId);//Get the data from Database....
		return user;
	}

	@Override
	public String authentication(String uName, String pWord) {
		
		Session session = this.sessionFactory.openSession();
		
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", uName));
		criteria.add(Restrictions.eq("password", pWord));
		
		criteria.setProjection(Projections.rowCount());
		Long count = (Long)criteria.uniqueResult();
		
		if(count == 1){
			return "SUCCESS";
		}else{
			return "INVALID_USER_NAME_PASSWORD";
		}
	}

}
