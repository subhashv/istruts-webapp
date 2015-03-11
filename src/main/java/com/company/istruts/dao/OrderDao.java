package com.company.istruts.dao;

import java.util.List;

import com.company.istruts.domain.Order;
import com.company.istruts.dto.OrderCriteriaDto;

public interface OrderDao {

	public List<Order> findOrdersByCriteria(OrderCriteriaDto criteriaDto);
	
	public Order viewOrderById(Long orderId);
}
