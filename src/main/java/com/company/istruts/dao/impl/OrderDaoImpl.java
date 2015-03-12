package com.company.istruts.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.company.istruts.dao.HibernateUtil;
import com.company.istruts.dao.OrderDao;
import com.company.istruts.domain.Order;
import com.company.istruts.dto.OrderCriteriaDto;

public class OrderDaoImpl implements OrderDao{
	
	private SessionFactory sessionFactory;
	
	public OrderDaoImpl() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	@Override
	public List<Order> findOrdersByCriteria(OrderCriteriaDto criteriaDto) {
		
		Session session = this.sessionFactory.openSession();
		Criteria crit = session.createCriteria(Order.class);
		List<Order> orderList = crit.list();
		return orderList;
	}

	@Override
	public Order viewOrderById(Long orderId) {
		return null;
	}

}
