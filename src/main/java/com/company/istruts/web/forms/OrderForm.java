package com.company.istruts.web.forms;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.company.istruts.domain.Order;

public class OrderForm extends ActionForm{

	private List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
