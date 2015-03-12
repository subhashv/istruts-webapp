package com.company.istruts.web.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

import com.company.istruts.domain.Order;
import com.company.istruts.service.OrderService;
import com.company.istruts.service.impl.OrderServiceImpl;
import com.company.istruts.web.forms.OrderForm;

public class OrderAction extends LookupDispatchAction{

	@Override
	protected Map getKeyMethodMap() {
//		Map<String, String> map = new HashMap<String, String>();
//        map.put("UserForm.add", "viewOrder");
//        map.put("UserForm.update", "createOrder");
//        map.put("UserForm.delete", "updateOrder");
//        map.put("UserForm.delete", "deleteOrder");
        return null;
	}
	
	@Override
	protected ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {//Search Functionality...
		
		System.out.println("---------------------------------------------------------------------");
		
		OrderForm orderForm = (OrderForm)form;
		
		
		OrderService service = new OrderServiceImpl();
		List<Order> orderList = service.findOrdersByCriteria(null);
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::"+orderList.size());
		orderForm.setOrders(orderList);
		
		return mapping.findForward("orderListingPage");
	}
	
	public void viewOrder(){
		
	}
	
	public void createOrder(){
		
	}
	
	public void updateOrder(){
		
	}
	
	public void deleteOrder(){
		
	}

}
