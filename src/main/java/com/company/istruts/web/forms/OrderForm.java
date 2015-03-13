package com.company.istruts.web.forms;

import java.util.Date;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.company.istruts.domain.Order;

public class OrderForm extends ActionForm{

	private Long orderId;
	
	private String orderStatus;
	
	private String orderStateDate;
	
	private String orderEndDate;
	
	private List<Order> orders;
	
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStateDate() {
		return orderStateDate;
	}

	public void setOrderStateDate(String orderStateDate) {
		this.orderStateDate = orderStateDate;
	}

	public String getOrderEndDate() {
		return orderEndDate;
	}

	public void setOrderEndDate(String orderEndDate) {
		this.orderEndDate = orderEndDate;
	}

	
}
