package com.company.istruts.service.impl;

import java.util.List;

import com.company.istruts.dao.OrderDao;
import com.company.istruts.dao.impl.OrderDaoImpl;
import com.company.istruts.domain.Order;
import com.company.istruts.dto.OrderCriteriaDto;
import com.company.istruts.service.OrderService;

public class OrderServiceImpl implements OrderService{

	private OrderDao orderDao;
	
	public OrderServiceImpl() {
		orderDao = new OrderDaoImpl();
	}
	
	@Override
	public List<Order> findOrdersByCriteria(OrderCriteriaDto criteriaDto) {
		List<Order> orderList = this.orderDao.findOrdersByCriteria(criteriaDto);
		return orderList;
	}

	@Override
	public Order viewOrderById(Long orderId) {
		Order order = this.orderDao.viewOrderById(orderId);
		return order;
	}

}
