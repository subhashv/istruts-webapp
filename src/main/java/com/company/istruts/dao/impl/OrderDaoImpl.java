package com.company.istruts.dao.impl;

import java.util.List;

import com.company.istruts.dao.OrderDao;
import com.company.istruts.domain.Order;
import com.company.istruts.dto.OrderCriteriaDto;

public class OrderDaoImpl implements OrderDao{

	@Override
	public List<Order> findOrdersByCriteria(OrderCriteriaDto criteriaDto) {
		return null;
	}

	@Override
	public Order viewOrderById(Long orderId) {
		return null;
	}

}
